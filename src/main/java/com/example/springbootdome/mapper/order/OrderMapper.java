package com.example.springbootdome.mapper.order;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootdome.model.order.OrderDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户订单 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderDO> {

   /* default PageResult<OrderDO> selectPage(OrderPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<OrderDO>()
                .eqIfPresent(OrderDO::getOrderNumber, reqVO.getOrderNumber())
                .eqIfPresent(OrderDO::getAccuntNo, reqVO.getAccuntNo())
                .eqIfPresent(OrderDO::getProductTotality, reqVO.getProductTotality())
                .eqIfPresent(OrderDO::getProductCategories, reqVO.getProductCategories())
                .eqIfPresent(OrderDO::getTotalAmount, reqVO.getTotalAmount())
                .eqIfPresent(OrderDO::getActualPayment, reqVO.getActualPayment())
                .eqIfPresent(OrderDO::getDiscountAmount, reqVO.getDiscountAmount())
                .orderByDesc(OrderDO::getId));
    }

    void insert(OrderDO order);*/
}