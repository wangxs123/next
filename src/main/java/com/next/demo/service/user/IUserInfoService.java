package com.next.demo.service.user;

import com.next.demo.entity.user.User;
import com.next.demo.request.user.UserInfoReq;

import java.util.List;

/**
 * @author wangxs
 * @date Create by 2018/11/22 14:12
 */

public interface IUserInfoService {
    /**
     * 添加用户
     * @param userInfoReq
     * @return
     */
    Boolean addUser(UserInfoReq userInfoReq);

    /**
     * 查询用户信息
     * @param user
     * @return
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
     * @return
     */
    Boolean deleteUser(UserInfoReq userInfoReq);

    /**
     * 更新用户信息
     * @param userInfoReq
     * @return
     */
    Boolean updateUser(UserInfoReq userInfoReq);
}
