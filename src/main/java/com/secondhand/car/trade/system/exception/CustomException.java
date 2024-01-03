package com.secondhand.car.trade.system.exception;

/**
 * 自定义异常
 *
 * @author ZengXuebin
 * @since 2024/1/3 23:39
 */
public class CustomException extends RuntimeException {

    /**
     * 错误码
     */
    protected Integer code;

    /**
     * 异常信息
     */
    protected String message;

    public CustomException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    public CustomException(Integer code, String message) {
        this(code, message, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
