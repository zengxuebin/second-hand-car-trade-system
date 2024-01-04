package com.secondhand.car.trade.system.pojo.DAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 估价实体 与t_valuation对应
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:36
 */
public class ValuationDAO {

    private Integer id;

    private UserDAO user;

    private CarDAO car;

    private BigDecimal valuationPrice;

    private LocalDateTime valuationTime;

    public ValuationDAO() {
    }

    public ValuationDAO(Integer id, UserDAO user, CarDAO car, BigDecimal valuationPrice, LocalDateTime valuationTime) {
        this.id = id;
        this.user = user;
        this.car = car;
        this.valuationPrice = valuationPrice;
        this.valuationTime = valuationTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserDAO getUser() {
        return user;
    }

    public void setUser(UserDAO user) {
        this.user = user;
    }

    public CarDAO getCar() {
        return car;
    }

    public void setCar(CarDAO car) {
        this.car = car;
    }

    public BigDecimal getValuationPrice() {
        return valuationPrice;
    }

    public void setValuationPrice(BigDecimal valuationPrice) {
        this.valuationPrice = valuationPrice;
    }

    public LocalDateTime getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(LocalDateTime valuationTime) {
        this.valuationTime = valuationTime;
    }
}
