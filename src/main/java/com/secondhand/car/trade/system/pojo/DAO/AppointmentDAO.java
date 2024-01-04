package com.secondhand.car.trade.system.pojo.DAO;

import java.time.LocalDateTime;

/**
 * 预约看车实体 与t_appointment对应
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:49
 */
public class AppointmentDAO {

    private Integer id;

    private UserDAO buyer;

    private UserDAO seller;

    private CarDAO car;

    private LocalDateTime appointmentTime;

    private Integer status;

    public AppointmentDAO() {
    }

    public AppointmentDAO(Integer id, UserDAO buyer, UserDAO seller, CarDAO car, LocalDateTime appointmentTime, Integer status) {
        this.id = id;
        this.buyer = buyer;
        this.seller = seller;
        this.car = car;
        this.appointmentTime = appointmentTime;
        this.status = status;
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

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
