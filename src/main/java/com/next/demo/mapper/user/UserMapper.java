package com.next.demo.mapper.user;

import com.next.demo.entity.user.User;
import com.next.demo.request.user.UserInfoReq;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

/**
 * @author wangxs
 * @date Create by 2018/11/22 13:38
 */
@Repository
public interface UserMapper{
    /**
     * 添加用户
     * @param userInfoReq
     */
    void addUser(UserInfoReq userInfoReq);

    /**
     * 查询用户信息
     * @param user
     */
    User queryUser(User user);

    /**
     * 查询用户返回list集合
     * @param user
     * @return
     */
    List<User> queryUserList(User user);

    /**
     * 删除用户
     * @param userInfoReq
     */
    void deleteUser(UserInfoReq userInfoReq);

    /**
     * 更新用户信息
     * @param userInfoReq
     */
    void updateUser(UserInfoReq userInfoReq);

}
