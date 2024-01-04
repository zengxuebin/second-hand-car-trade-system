package com.secondhand.car.trade.system.pojo.DAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 车辆实体 与t_car对应
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:31
 */
public class CarDAO {

    private Integer id;

    private UserDAO seller;

    private String make;

    private String model;

    private Integer year;

    private String color;

    private BigDecimal originalPrice;

    private BigDecimal usedPrice;

    private Integer mileage;

    private String description;

    private String photoUrl;

    private Integer status;

    private LocalDateTime addTime;

    private LocalDateTime updateTime;

    public CarDAO() {
    }

    public CarDAO(Integer id, UserDAO seller, String make, String model, Integer year, String color, BigDecimal originalPrice, BigDecimal usedPrice, Integer mileage, String description, String photoUrl, Integer status, LocalDateTime addTime, LocalDateTime updateTime) {
        this.id = id;
        this.seller = seller;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.originalPrice = originalPrice;
        this.usedPrice = usedPrice;
        this.mileage = mileage;
        this.description = description;
        this.photoUrl = photoUrl;
        this.status = status;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserDAO getSeller() {
        return seller;
    }

    public void setSeller(UserDAO seller) {
        this.seller = seller;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getUsedPrice() {
        return usedPrice;
    }

    public void setUsedPrice(BigDecimal usedPrice) {
        this.usedPrice = usedPrice;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
