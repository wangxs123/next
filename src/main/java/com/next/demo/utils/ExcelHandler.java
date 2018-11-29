package com.next.demo.utils;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.List;

/**
 * @author
 * @date
 */
public class ExcelHandler {
    public static void getExcelInfo(InputStream inputStream) {
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

    private static void readExcelValue(Workbook wb) {
        // 得到第一个shell
        Sheet sheet = wb.getSheet(0);
        int rsRows = sheet.getRows();
        for (int i=1;i<rsRows;i++){
            System.out.println(sheet.getCell(0,i).getContents());
        }
    }


    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("F:/ceshi.xls");
            getExcelInfo(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
