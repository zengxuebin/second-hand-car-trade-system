package com.secondhand.car.trade.system.pojo.DAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 交易记录实体 与t_transaction对应
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:54
 */
public class TransactionDAO {

    private Integer id;

    private UserDAO buyer;

    private UserDAO seller;

    private CarDAO car;

    private String transactionNo;

    private Integer transactionType;

    private BigDecimal transactionPrice;

    private LocalDateTime transactionTime;

    private Integer transactionStatus;

    private String transactionRemark;

    public TransactionDAO() {
    }

    public TransactionDAO(Integer id, UserDAO buyer, UserDAO seller, CarDAO car, String transactionNo, Integer transactionType, BigDecimal transactionPrice, LocalDateTime transactionTime, Integer transactionStatus, String transactionRemark) {
        this.id = id;
        this.buyer = buyer;
        this.seller = seller;
        this.car = car;
        this.transactionNo = transactionNo;
        this.transactionType = transactionType;
        this.transactionPrice = transactionPrice;
        this.transactionTime = transactionTime;
        this.transactionStatus = transactionStatus;
        this.transactionRemark = transactionRemark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserDAO getBuyer() {
        return buyer;
    }

    public void setBuyer(UserDAO buyer) {
        this.buyer = buyer;
    }

    public UserDAO getSeller() {
        return seller;
    }

    public void setSeller(UserDAO seller) {
        this.seller = seller;
    }

    public CarDAO getCar() {
        return car;
    }

    public void setCar(CarDAO car) {
        this.car = car;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getTransactionPrice() {
        return transactionPrice;
    }

    public void setTransactionPrice(BigDecimal transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(Integer transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionRemark() {
        return transactionRemark;
    }

    public void setTransactionRemark(String transactionRemark) {
        this.transactionRemark = transactionRemark;
    }
}
