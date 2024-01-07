package com.example.springbootdome.model.ofproduct;

import lombok.*;
import com.baomidou.mybatisplus.annotation.*;

/**
 * 用户购买的商品 DO
 *
 * @author 芋道源码
 */
@TableName("account_of_product")
@KeySequence("account_of_product_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class OfProductDO {

    /**
     * 商品号
     */
    @TableId(type = IdType.INPUT)
    private String productId;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 商品价格
     */
    private String productPrice;
    /**
     * 商品数量
     */
    private String productQuantity;
    /**
     * 商品总金额
     */
    private String totalAmountOfProduct;
    /**
     * 账号
     */
    private String accunt;

}