package com.next.demo.entity.user;

import java.util.Date;

/**
 * @author wangxs
 * @date Create by 2018/11/22 10:44
 */
public class User {
    private String uuid;
    private String userName;
    private Integer age;
    private String sex;
    private String password;
    private String state;
    private String createDate;
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
        return "User{" +
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
