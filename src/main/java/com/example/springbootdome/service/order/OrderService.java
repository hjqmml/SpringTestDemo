package com.example.springbootdome.service.order;

import javax.validation.*;
import com.example.springbootdome.controller.order.vo.OrderSaveReqVO;
import com.example.springbootdome.model.order.OrderDO;

/**
 * 用户订单 Service 接口
 *
 * @author 芋道源码
 */
public interface OrderService {

    /**
     * 创建用户订单
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    String createOrder(@Valid OrderSaveReqVO createReqVO);

    /**
     * 更新用户订单
     *
     * @param updateReqVO 更新信息
     */
    void updateOrder(@Valid OrderSaveReqVO updateReqVO);

    /**
     * 删除用户订单
     *
     * @param id 编号
     */
    void deleteOrder(String id);

    /**
     * 获得用户订单
     *
     * @param id 编号
     * @return 用户订单
     */
    OrderDO getOrder(String id);
}