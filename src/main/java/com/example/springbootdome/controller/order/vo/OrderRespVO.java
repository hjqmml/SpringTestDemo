package com.example.springbootdome.controller.order.vo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.*;


@ApiOperation(value = "管理后台 - 用户订单 Response VO")
@Data
public class OrderRespVO {

    @ApiModelProperty(value = "订单号")
    private String orderNumber;

    @ApiModelProperty(value = "用户账号")
    private String accuntNo;

    @ApiModelProperty(value = "商品总数")
    private String productTotality;

    @ApiModelProperty(value = "商品种类数")
    private String productCategories;

    @ApiModelProperty(value = "总金额")
    private String totalAmount;

    @ApiModelProperty(value = "实付款")
    private String actualPayment;

    @ApiModelProperty(value = "优惠总金额")
    private String discountAmount;

}