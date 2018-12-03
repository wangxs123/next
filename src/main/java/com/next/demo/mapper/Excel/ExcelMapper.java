package com.next.demo.mapper.Excel;

import com.next.demo.entity.user.User;
import com.next.demo.request.user.UserInfoReq;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wangxs
 * @date Create by 2018/11/22 13:38
 */
@Repository
public interface ExcelMapper {

    /**
     * 更新用户信息
     * @param map
     */
    void updateExcel(Map<Object,Object> map);

    /**
     *
     * @param map
     */
    void updateDate(Map<Object,Object> map);

}
