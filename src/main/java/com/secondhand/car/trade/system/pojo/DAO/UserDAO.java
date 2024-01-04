package com.secondhand.car.trade.system.pojo.DAO;

import java.time.LocalDateTime;

/**
 * 用户实体 与t_user对应
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:28
 */
public class UserDAO {

    private Integer id;

    private String username;

    private String password;

    private String role;

    private String email;

    private String phoneNumber;

    private String address;

    private LocalDateTime registerTime;

    private LocalDateTime updateTime;

    public UserDAO() {
    }

    public UserDAO(Integer id, String username, String password, String role, String email, String phoneNumber, String address, LocalDateTime registerTime, LocalDateTime updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(LocalDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
