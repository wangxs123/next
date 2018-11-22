package com.next.demo.controller;

import com.next.demo.entity.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxs
 * @date Create by 2018/11/22 9:45
 */
@RestController
@RequestMapping("/")
public class MainController {
    @RequestMapping("getHello")
    public Object getHello(){
        return "hello next!";
    }
    @RequestMapping("/getUserInfo")
    public User getUserInfo(){
        User user = new User();
        user.setUserName("张胜男");
        user.setAge(18);
        user.setSex("女");
        user.setPassword("exit");
        return user;
    }
    @RequestMapping("/addUserInfo")
    public Object addUserInfo(){

        return null;
    }
    @RequestMapping("/queryUserInfo")
    public User queryUserInfo(){

        return null;
    }
    @RequestMapping("/deleteUserInfo")
    public Object deleteUserInfo(){

        return null;
    }
    @RequestMapping("/updateUserInfo")
    public Object updateUserInfo(){

        return null;
    }
}
