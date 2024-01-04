package com.secondhand.car.trade.system.enums;

/**
 * 交易状态枚举类
 *
 * @author ZengXuebin
 * @since 2024/1/4 23:46
 */
public enum TransactionStatusEnum {

    /**
     * 订单已创建 等待确认
     */
    CREATED(0),

    /**
     * 买家已确认订单
     */
    BUYER_CONFIRMED(1),

    /**
     * 卖家已确认订单
     */
    SELLER_CONFIRMED(2),

    /**
     * 待付款
     */
    PAYMENT_PENDING(3),

    /**
     * 已付款
     */
    PAYMENT_COMPLETED(4),

    /**
     * 已安排提车
     */
    CAR_PICKUP_SCHEDULED(5),

    /**
     * 车已提走
     */
    CAR_PICKED_UP(6),

    /**
     * 已安排验车
     */
    INSPECTION_SCHEDULED(7),

    /**
     * 验车已完成
     */
    INSPECTION_COMPLETED(8),

    /**
     * 正在办理过户手续
     */
    DOCUMENTATION_PROCESSING(9),

    /**
     * 过户手续已完成
     */
    DOCUMENTATION_COMPLETED(10),

    /**
     * 已安排交付
     */
    DELIVERY_SCHEDULED(11),

    /**
     * 交易已完成
     */
    TRADED(12),

    /**
     * 交易已取消
     */
    CANCELED(-1),

    /**
     * 已退款
     */
    REFUNDED(-2),

    /**
     * 争议处理中
     */
    DISPUTE_PENDING(-3);


    private final Integer code;

    TransactionStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
