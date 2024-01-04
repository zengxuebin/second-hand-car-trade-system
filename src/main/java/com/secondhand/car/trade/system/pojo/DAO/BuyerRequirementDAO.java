package com.secondhand.car.trade.system.pojo.DAO;

import java.time.LocalDateTime;

/**
 * 买买家需求实体 与t_buyer_requirement对应
 *
 * @author ZengXuebin
 * @since 2024/1/4 22:38
 */
public class BuyerRequirementDAO {

    private Integer id;

    private UserDAO buyer;

    private String make;

    private String model;

    private String yearRange;

    private String budgetRange;

    private LocalDateTime createTime;

    public BuyerRequirementDAO() {
    }

    public BuyerRequirementDAO(Integer id, UserDAO buyer, String make, String model, String yearRange, String budgetRange, LocalDateTime createTime) {
        this.id = id;
        this.buyer = buyer;
        this.make = make;
        this.model = model;
        this.yearRange = yearRange;
        this.budgetRange = budgetRange;
        this.createTime = createTime;
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

    public String getYearRange() {
        return yearRange;
    }

    public void setYearRange(String yearRange) {
        this.yearRange = yearRange;
    }

    public String getBudgetRange() {
        return budgetRange;
    }

    public void setBudgetRange(String budgetRange) {
        this.budgetRange = budgetRange;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
