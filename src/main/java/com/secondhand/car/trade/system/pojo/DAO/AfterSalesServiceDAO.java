package com.secondhand.car.trade.system.pojo.DAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 售后服务实体 与t_after_sales_service
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:44
 */
public class AfterSalesServiceDAO {

    private Integer id;

    private UserDAO buyer;

    private CarDAO car;

    private Integer serviceType;

    private BigDecimal servicePrice;

    private LocalDateTime serviceStartTime;

    private LocalDateTime serviceEndTime;

    private String serviceDescription;

    public AfterSalesServiceDAO() {
    }

    public AfterSalesServiceDAO(Integer id, UserDAO buyer, CarDAO car, Integer serviceType, BigDecimal servicePrice, LocalDateTime serviceStartTime, LocalDateTime serviceEndTime, String serviceDescription) {
        this.id = id;
        this.buyer = buyer;
        this.car = car;
        this.serviceType = serviceType;
        this.servicePrice = servicePrice;
        this.serviceStartTime = serviceStartTime;
        this.serviceEndTime = serviceEndTime;
        this.serviceDescription = serviceDescription;
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

    public CarDAO getCar() {
        return car;
    }

    public void setCar(CarDAO car) {
        this.car = car;
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public BigDecimal getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(BigDecimal servicePrice) {
        this.servicePrice = servicePrice;
    }

    public LocalDateTime getServiceStartTime() {
        return serviceStartTime;
    }

    public void setServiceStartTime(LocalDateTime serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public LocalDateTime getServiceEndTime() {
        return serviceEndTime;
    }

    public void setServiceEndTime(LocalDateTime serviceEndTime) {
        this.serviceEndTime = serviceEndTime;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
}
