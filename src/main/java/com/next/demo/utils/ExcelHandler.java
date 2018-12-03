package com.next.demo.utils;

import com.next.demo.mapper.Excel.ExcelMapper;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @date
 */
@RestController
@RequestMapping("/")
public class ExcelHandler {
    @Autowired
    ExcelMapper excelMapper;
    public void getExcelInfo(InputStream inputStream) {
        try {
            /** 根据版本选择创建Workbook的方式 */
            Workbook workbook = Workbook.getWorkbook(inputStream);
            readExcelValue(workbook);
        } catch (IOException e) {
            e.getMessage();
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    private  void readExcelValue(Workbook wb) {
        // 得到第一个shell
        Sheet sheet = wb.getSheet(0);
        int rsRows = sheet.getRows();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<Object,Object> map = new HashMap<>(16);
        for (int i=1;i<rsRows;i++){
            String date = simpleDateFormat.format(new Date());
            map.put("date",date);
            map.put("host",sheet.getCell(0,i).getContents());
            excelMapper.updateExcel(map);
        }
        System.out.println("rsRows......."+rsRows);
    }


//    @RequestMapping(value = "/time",method = RequestMethod.POST)
//    public void updateExcel(){
//        try {
//            InputStream inputStream = new FileInputStream("F:/ss.xls");
//            getExcelInfo(inputStream);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }


//    @RequestMapping(value = "/time",method = RequestMethod.POST)
//    public  void updateTime(){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date = simpleDateFormat.format(new Date());
//        Map<Object,Object> map = new HashMap<>(16);
//        map.put("date",date);
//        map.put("id",1);
//        excelMapper.updateDate(map);
//    }
}
