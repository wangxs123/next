package com.next.demo.service.user.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.next.demo.entity.user.User;
import com.next.demo.mapper.user.UserMapper;
import com.next.demo.request.user.UserInfoReq;
import com.next.demo.service.user.IUserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author wangxs
 * @date Create by 2018/11/22 14:13
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {
    private static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
    @Autowired
    UserMapper userMapper;

    @Override
    public Boolean addUser(UserInfoReq userInfoReq) {
        userInfoReq.setUuid(UUID.randomUUID().toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = simpleDateFormat.format(new Date());
        try {
            userInfoReq.setCreateDate(date);
            userMapper.addUser(userInfoReq);
            logger.info("插入用户成功");
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("插入用户出错");
            return false;
        }
        return true;
    }

    @Override
    public User queryUser(User user) {
        User userInfo = new User();
        try {
            userInfo = userMapper.queryUser(user);
            logger.info("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("查询失败");
            return userInfo;
        }
        return userInfo;
    }

    @Override
    public PageInfo<User> queryUserList(User user) {
        Page<User> userInfo = new Page<>();
        try {
            userInfo = userMapper.queryUserList(user);
            logger.info("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("查询失败");
            return new PageInfo<>(userInfo);
        }
        return new PageInfo<>(userInfo);
    }

    @Override
    public Boolean deleteUser(UserInfoReq userInfoReq) {

        return true;

    }

    @Override
    public Boolean updateUser(UserInfoReq userInfoReqr) {

        return true;

    }
}
