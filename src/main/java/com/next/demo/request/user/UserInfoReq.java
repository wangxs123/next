package com.next.demo.request.user;

import javax.validation.constraints.NotEmpty;

/**
 * @author wangxs
 * @date Create by 2018/11/22 14:21
 */
public class UserInfoReq {
    public interface AddUserInfoGroup{};
    public interface DeleteUserInfoGroup{};

    /**
     * 主键uuid
     */
    @NotEmpty(groups = {DeleteUserInfoGroup.class},message = "uuid不能为空")
    private String uuid;
    /**
     * 用户名
     */
    @NotEmpty(groups = {AddUserInfoGroup.class},message = "用户名不能为空")
    private String userName;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private String sex;
    /**
     * 用户密码
     */
    @NotEmpty(groups = {AddUserInfoGroup.class},message = "密码不能为空")
    private String password;
    /**
     * 状态
     */
    private String state;
    /**
     * 创建时间
     */
    private String createDate;
    /**
     * 更新时间
     */
    private String updateDate;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "UserInfoReq{" +
                "uuid=" + uuid +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", passWord='" + password + '\'' +
                ", state='" + state + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
