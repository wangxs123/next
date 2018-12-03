package com.next.demo.enums;

/**
 * ResultCode枚举
 *
 * @author wxs
 * @date 2018-11-30 17:02:39
 */
public enum ResultCodeEnum {
    /**
     * 操作成功
     */
    OPERATION_SUCCESS(1000,"操作成功"),
    /**
     * 请求参数不合法
     */
    REQUEST_PARAM_ERROR(2001,"请求参数不合法"),
    /**
     * 缺少请求参数
     */
    REQUEST_PARAM_LACK(2002,"缺少请求参数"),
    /**
     * 请求参数为空
     */
    REQUEST_PARAM_EMPTY(2003,"请求参数为空"),
    /**
     * 查询数据失败
     */
    QUERY_DATA_ERROR(3001,"查询数据失败"),
    /**
     * 新增数据失败
     */
    APPEND_DATA_ERROR(3002,"新增数据失败"),
    /**
     * 修改数据失败
     */
    MODIFY_DATA_ERROR(3003,"修改数据失败"),
    /**
     * 删除数据失败
     */
    DELETE_DATA_ERROR(3004,"删除数据失败"),
    /**
     * 内部调用接口错误
     */
    INSIDE_INTERFACE_INVOKE_ERROR(4001,"内部调用接口错误"),
    /**
     * 未知错误
     */
    UNKNOWN_ERROR(9001,"未知错误"),
    /**
     * 系统异常
     */
    SYSTEM_EXCEPTION(9002,"系统异常"),
    /**
     * 并发错误
     */
    CONCURRENCY_ERROR(9003,"并发错误"),
    /**
     * 缺少权限
     */
    LACK_AUTH(1002,"缺少权限"),
    /**
     * 登录异常
     */
    LOGIN_ERROR(1001,"登录异常"),
    /**
     * 邮箱已存在
     */
    EMAIL_EXIST(1003,"邮箱已存在"),
    /**
     * 手机号已存在
     */
    PHONE_EXIST(1004,"手机号已存在"),
    /**
     * 手机号已存在（用户重新绑定手机号*专用*）
     */
    USE_PHONE_EXIST(1005,"手机号已存在"),
    /**
     * 同级部门重复
     */
    DEPART_EXIST(1006,"同级部门重复"),
    /**
     * 下级权限已存在
     */
    CHILD_PERMISSION_EXIST(1007,"下级权限已存在");
    private  int key;
    private  String desc;

    /**
     * 键
     *
     * @return 键
     */
    public int key() {
        return key;
    }

    /**
     * 描述
     *
     * @return 描述
     */
    public String desc() {
        return desc;
    }

    ResultCodeEnum(final  int key, final  String desc){
        this.key=key;
        this.desc=desc;
    }
}
