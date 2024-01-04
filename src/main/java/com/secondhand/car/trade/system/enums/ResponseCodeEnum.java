package com.secondhand.car.trade.system.enums;

/**
 * 返回结果集状态码
 *
 * @author ZengXuebin
 * @since 2024/1/3 20:22
 */
public enum ResponseCodeEnum {

    SUCCESS(200, "操作成功！"),
    FAILURE(201, "操作失败！"),

    /**
     * 系统错误码：5xx
     */
    ERROR(500, "系统异常，请稍后重试！"),

    /**
     * 权限错误码：4xx
     */
    USERNAME_OR_PASSWORD_ERROR(401, "用户名或密码错误");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 信息
     */
    private final String message;

    ResponseCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
