package com.secondhand.car.trade.system.enums;

/**
 * 车辆状态枚举类
 *
 * @author ZengXuebin
 * @since 2024/1/4 23:02
 */
public enum CarStatusEnum {

    /**
     * 待出售
     */
    WAITING_TO_SELL(0),

    /**
     * 已预定
     */
    RESERVED(1),

    /**
     * 已出售
     */
    SOLD(2),

    /**
     * 已下架
     */
    OFF_SHELF(3);

    private final Integer code;

    CarStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
