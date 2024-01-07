package com.example.springbootdome.controller.ofproduct.vo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.*;

@ApiOperation(value = "管理后台 - 用户购买的商品分页 Request VO")
@Data
@ToString(callSuper = true)
public class OfProductPageReqVO {

    @ApiModelProperty(value = "商品号", example = "27291")
    private String productId;

    @ApiModelProperty(value = "订单号", example = "10697")
    private String orderId;

    @ApiModelProperty(value = "商品价格", example = "17946")
    private String productPrice;

    @ApiModelProperty(value = "商品数量")
    private String productQuantity;

    @ApiModelProperty(value = "商品总金额")
    private String totalAmountOfProduct;

    @ApiModelProperty(value = "账号")
    private String accunt;

}