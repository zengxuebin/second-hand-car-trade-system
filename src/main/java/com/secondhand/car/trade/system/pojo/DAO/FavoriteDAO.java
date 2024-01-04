package com.secondhand.car.trade.system.pojo.DAO;

import java.time.LocalDateTime;

/**
 * 收藏实体 与t_favorite对应
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:34
 */
public class FavoriteDAO {

    private Integer id;

    private UserDAO buyer;

    private CarDAO car;

    private LocalDateTime favoriteTime;

    public FavoriteDAO() {
    }

    public FavoriteDAO(Integer id, UserDAO buyer, CarDAO car, LocalDateTime favoriteTime) {
        this.id = id;
        this.buyer = buyer;
        this.car = car;
        this.favoriteTime = favoriteTime;
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

    public LocalDateTime getFavoriteTime() {
        return favoriteTime;
    }

    public void setFavoriteTime(LocalDateTime favoriteTime) {
        this.favoriteTime = favoriteTime;
    }
}
