package com.example.springbootdome.model.order;

import lombok.*;
import com.baomidou.mybatisplus.annotation.*;

/**
 * 用户订单 DO
 *
 * @author 芋道源码
 */
@TableName("user_order")
@Data
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDO  {

    /**
     * d订单号
     */
    @TableId(type = IdType.INPUT)
    private String orderNumber;
    /**
     * 用户账号
     */
    private String accuntNo;
    /**
     * 商品总数
     */
    private String productTotality;
    /**
     * 商品种类数
     */
    private String productCategories;
    /**
     * 总金额
     */
    private String totalAmount;
    /**
     * 实付款
     */
    private String actualPayment;
    /**
     * 优惠总金额
     */
    private String discountAmount;

}