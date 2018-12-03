package com.next.demo.controller.user;

import com.github.pagehelper.PageInfo;
import com.next.demo.entity.user.User;
import com.next.demo.request.user.UserInfoReq;
import com.next.demo.response.Result;
import com.next.demo.service.user.impl.UserInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangxs
 * @date Create by 2018/11/22 14:42
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {
    private static Logger logger = LoggerFactory.getLogger(UserInfoController.class);
    @Autowired
    UserInfoServiceImpl userInfoService;

    @PostMapping("/addUser")
    public Result addUser(@RequestBody @Validated(UserInfoReq.AddUserInfoGroup.class) UserInfoReq req){
        logger.info("begin UserInfoController addUser method ...request:"+req);
        Boolean result = userInfoService.addUser(req);
        if(result){
            return new Result("success");
        }else {
            return new Result("failed");
        }
    }
    @RequestMapping("/queryUser")
    public Result<PageInfo> queryUser(User user){
        PageInfo<User> userInfo = userInfoService.queryUserList(user);
        return new Result<>(userInfo);
    }
}
