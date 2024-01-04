package com.secondhand.car.trade.system.pojo.DAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 询价实体 与t_inquiry对应
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:40
 */
public class InquiryDAO {

    private Integer id;

    private UserDAO buyer;

    private UserDAO seller;

    private CarDAO car;

    private BigDecimal inquirePrice;

    private LocalDateTime inquireTime;

    private String replyContent;

    private LocalDateTime replyTime;

    public InquiryDAO() {
    }

    public InquiryDAO(Integer id, UserDAO buyer, UserDAO seller, CarDAO car, BigDecimal inquirePrice, LocalDateTime inquireTime, String replyContent, LocalDateTime replyTime) {
        this.id = id;
        this.buyer = buyer;
        this.seller = seller;
        this.car = car;
        this.inquirePrice = inquirePrice;
        this.inquireTime = inquireTime;
        this.replyContent = replyContent;
        this.replyTime = replyTime;
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

    public BigDecimal getInquirePrice() {
        return inquirePrice;
    }

    public void setInquirePrice(BigDecimal inquirePrice) {
        this.inquirePrice = inquirePrice;
    }

    public LocalDateTime getInquireTime() {
        return inquireTime;
    }

    public void setInquireTime(LocalDateTime inquireTime) {
        this.inquireTime = inquireTime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public LocalDateTime getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(LocalDateTime replyTime) {
        this.replyTime = replyTime;
    }
}
