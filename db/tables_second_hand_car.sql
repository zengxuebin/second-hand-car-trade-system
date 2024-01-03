/*
 * 二手车交易平台数据库
 */

CREATE database IF NOT EXISTS `second_hand_car` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
use `second_hand_car`;

SET NAMES utf8mb4;

/*
 * 用户表
 */
CREATE TABLE IF NOT EXISTS `t_user`
(
    `id`            INT(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID，自增',
    `username`      VARCHAR(50) NOT NULL COMMENT '用户名(账号)',
    `password`      VARCHAR(50) NOT NULL COMMENT '密码',
    `role`          VARCHAR(16) NOT NULL COMMENT '角色：0-管理员；1-普通用户',
    `email`         VARCHAR(50) COMMENT '邮箱',
    `phone_number`  VARCHAR(50) COMMENT '手机号',
    `address`       VARCHAR(255) DEFAULT NULL COMMENT '家庭住址',
    `register_time` DATETIME     NOT NULL COMMENT '注册时间',
    `update_time`   DATETIME     NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `i_username` (`username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*
 * 车辆表
 */
CREATE TABLE IF NOT EXISTS `t_car`
(
    `id`             INT(11) NOT NULL AUTO_INCREMENT COMMENT '车辆ID，自增',
    `seller_id`      INT(11) NOT NULL COMMENT '卖家ID',
    `make`           VARCHAR(50)    NOT NULL COMMENT '品牌',
    `model`          VARCHAR(50)    NOT NULL COMMENT '型号',
    `year`           INT(11) NOT NULL COMMENT '生产年份',
    `color`          VARCHAR(50)    NOT NULL COMMENT '颜色',
    `original_price` DECIMAL(10, 2) NOT NULL COMMENT '原价',
    `used_price`     DECIMAL(10, 2) NOT NULL COMMENT '二手价',
    `mileage`        INT(11) NOT NULL COMMENT '行驶里程',
    `description`    TEXT COMMENT '描述',
    `photo_url`      VARCHAR(255) COMMENT '图片地址',
    `status`         INT(4) NOT NULL DEFAULT '0' COMMENT '车辆状态：0-待出售；1-已出售，2-已售完；3-已下架',
    `add_time`       DATETIME NOT NULL COMMENT '添加时间',
    `update_time`    DATETIME NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`seller_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*
 * 收藏表
 */
CREATE TABLE IF NOT EXISTS `t_favorite`
(
    `id`            INT(11) NOT NULL AUTO_INCREMENT COMMENT '收藏ID，自增',
    `buyer_id`      INT(11) NOT NULL COMMENT '买家ID',
    `car_id`        INT(11) NOT NULL COMMENT '车辆ID',
    `favorite_time` DATETIME NOT NULL COMMENT '收藏时间',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`buyer_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`car_id`) REFERENCES `t_car` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*
 * 平台估价表
 */
CREATE TABLE IF NOT EXISTS `t_valuation`
(
    `id`              INT(11) NOT NULL AUTO_INCREMENT COMMENT '估价ID，自增',
    `user_id`         INT(11) NOT NULL COMMENT '用户ID',
    `car_id`          INT(11) NOT NULL COMMENT '车辆ID',
    `valuation_price` DECIMAL(10, 2) NOT NULL COMMENT '估价价格',
    `valuation_time`  DATETIME DEFAULT NULL COMMENT '估价时间',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`car_id`) REFERENCES `t_car` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*
 * 买家需求信息表
 */
CREATE TABLE IF NOT EXISTS `t_buyer_requirement`
(
    `id`           INT(11) NOT NULL AUTO_INCREMENT COMMENT '需求ID，自增',
    `buyer_id`     INT(11) NOT NULL COMMENT '买家ID',
    `make`         VARCHAR(50) NOT NULL COMMENT '品牌',
    `model`        VARCHAR(50) NOT NULL COMMENT '型号',
    `year_range`   VARCHAR(50) NOT NULL COMMENT '年份范围',
    `budget_range` VARCHAR(50) NOT NULL COMMENT '预算范围',
    `create_time`  DATETIME NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`buyer_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*
 * 询价表
 */
CREATE TABLE IF NOT EXISTS `t_inquiry`
(
    `id`            INT(11) NOT NULL AUTO_INCREMENT COMMENT '询价ID，自增',
    `buyer_id`      INT(11) NOT NULL COMMENT '买家ID',
    `seller_id`     INT(11) NOT NULL COMMENT '卖家ID',
    `car_id`        INT(11) NOT NULL COMMENT '车辆ID',
    `inquiry_price` DECIMAL(10, 2) NOT NULL COMMENT '询价价格',
    `inquiry_time`  DATETIME       NOT NULL COMMENT '询价时间',
    `reply_content` VARCHAR(255) DEFAULT NULL COMMENT '卖家回复内容',
    `reply_time`    DATETIME     DEFAULT NULL COMMENT '卖家回复时间',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`buyer_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`seller_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`car_id`) REFERENCES `t_car` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*
 * 售后服务记录表
 */
CREATE TABLE IF NOT EXISTS `t_after_sales_service`
(
    `id`                  INT(11) NOT NULL AUTO_INCREMENT COMMENT '售后服务ID，自增',
    `buyer_id`            INT(11) NOT NULL COMMENT '买家ID',
    `car_id`              INT(11) NOT NULL COMMENT '车辆ID',
    `service_type`        INT(4) NOT NULL COMMENT '售后服务类型：0-维修；1-保养；2-更换；3-其它',
    `service_price`       DECIMAL(10, 2) NOT NULL COMMENT '服务价格',
    `service_start_time`  DATETIME     DEFAULT NULL COMMENT '服务生效时间',
    `service_end_time`    DATETIME     DEFAULT NULL COMMENT '服务到期时间',
    `service_description` VARCHAR(255) DEFAULT NULL COMMENT '服务描述',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`buyer_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`car_id`) REFERENCES `t_car` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*
 * 预约看车表
 */
CREATE TABLE IF NOT EXISTS `t_appointment`
(
    `id`               INT(11) NOT NULL AUTO_INCREMENT COMMENT '预约看车ID，自增',
    `buyer_id`         INT(11) NOT NULL COMMENT '买家ID',
    `seller_id`        INT(11) NOT NULL COMMENT '卖家ID',
    `car_id`           INT(11) NOT NULL COMMENT '车辆ID',
    `appointment_time` DATETIME DEFAULT NULL COMMENT '预约时间',
    `status`           INT(4) NOT NULL DEFAULT '0' COMMENT '预约状态：0-待处理；1-已处理；2-已取消',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`buyer_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`seller_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`car_id`) REFERENCES `t_car` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*
 * 交易记录表
 */
CREATE TABLE IF NOT EXISTS `t_transaction`
(
    `id`                 INT(11) NOT NULL AUTO_INCREMENT COMMENT '交易ID，自增',
    `buyer_id`           INT(11) NOT NULL COMMENT '买家ID',
    `seller_id`          INT(11) NOT NULL COMMENT '卖家ID',
    `car_id`             INT(11) NOT NULL COMMENT '车辆ID',
    `transaction_no`     VARCHAR(50)    NOT NULL COMMENT '交易编号',
    `transaction_type`   INT(4) NOT NULL COMMENT '交易类型：0-出售；1-购买；3-其它',
    `transaction_price`  DECIMAL(10, 2) NOT NULL COMMENT '交易价格',
    `transaction_time`   DATETIME       NOT NULL COMMENT '交易时间',
    `transaction_status` INT(4) NOT NULL DEFAULT '0' COMMENT '交易状态：0-待处理；1-已处理；2-已取消',
    `transaction_remark` VARCHAR(255) DEFAULT NULL COMMENT '交易备注',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`buyer_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`seller_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`car_id`) REFERENCES `t_car` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

