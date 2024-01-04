package com.secondhand.car.trade.system.enums;

/**
 * @author ZengXuebin
 * @since 2024/1/4 23:40
 */
public enum TransactionTypeEnum {

    /**
     * 出售
     */
    SELL(0),

    /**
     * 购买
     */
    BUY(1),

    /**
     * 其它
     */
    OTHER(2);

    private final Integer code;

    TransactionTypeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
