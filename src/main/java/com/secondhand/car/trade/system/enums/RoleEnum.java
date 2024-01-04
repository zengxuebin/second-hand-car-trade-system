package com.secondhand.car.trade.system.enums;

/**
 * 角色枚举类
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:58
 */
public enum RoleEnum {

    /**
     * 管理员
     */
    ADMIN(0),
    /**
     * 普通用户 买家/卖家
     */
    USER(1);

    private final Integer code;

    RoleEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
