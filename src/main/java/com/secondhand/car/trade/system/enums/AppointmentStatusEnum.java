package com.secondhand.car.trade.system.enums;

/**
 * 预约看车状态枚举类
 *
 * @author ZengXuebin
 * @since 2024/1/4 23:37
 */
public enum AppointmentStatusEnum {

    /**
     * 待处理
     */
    PENDING(0),

    /**
     * 已处理
     */
    PROCESSED(1),

    /**
     * 已取消
     */
    CANCELED(2);

    private final Integer code;

    AppointmentStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
