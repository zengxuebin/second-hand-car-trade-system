package com.secondhand.car.trade.system.enums;

/**
 * 售后服务类型枚举类
 *
 * @author ZengXuebin
 * @since 2024/1/4 23:10
 */
public enum ServiceTypeEnum {

    /**
     * 保修
     */
    WARRANTY(0),

    /**
     * 保养
     */
    MAINTENANCE(1),

    /**
     * 维修
     */
    REPAIR(2),

    /**
     * 退货
     */
    RETURN(3),

    /**
     * 咨询
     */
    CONSULTATION(4),

    /**
     * 其它
     */
    OTHER(5);

    private final Integer code;

    ServiceTypeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
