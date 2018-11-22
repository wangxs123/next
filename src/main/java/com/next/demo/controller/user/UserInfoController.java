package com.next.demo.controller.user;

import com.next.demo.entity.user.User;
import com.next.demo.request.user.UserInfoReq;
import com.next.demo.service.user.impl.UserInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Object addUser(@RequestBody @Validated(UserInfoReq.AddUserInfoGroup.class) UserInfoReq req){
        logger.info("begin UserInfoController addUser method ...request:"+req);
        Boolean result = userInfoService.addUser(req);
        if(result){
            return "success";
        }else {
            return "failed";
        }
    }
    @PostMapping("/queryUser")
    public User queryUser(User user){
        User userInfo = userInfoService.queryUser(user);
        return userInfo;
    }
}
