package com.example.springbootdome.service.order;

import com.example.springbootdome.commen.util.BeanUtils;
import com.example.springbootdome.controller.order.vo.OrderSaveReqVO;
import com.example.springbootdome.mapper.order.OrderMapper;
import com.example.springbootdome.model.order.OrderDO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;


/**
 * 用户订单 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public String createOrder(OrderSaveReqVO createReqVO) {
        // 插入
        OrderDO order = BeanUtils.toBean(createReqVO, OrderDO.class);
        order.setOrderNumber(UUID.randomUUID().toString());

        orderMapper.insert(order);
        // 返回
        return order.getAccuntNo();
    }

    @Override
    public void updateOrder(OrderSaveReqVO updateReqVO) {
        // 更新
        OrderDO updateObj = BeanUtils.toBean(updateReqVO, OrderDO.class);
        orderMapper.updateById(updateObj);
    }

    @Override
    public void deleteOrder(String id) {
        // 删除
        orderMapper.deleteById(id);
    }

    @Override
    public OrderDO getOrder(String id) {
        return orderMapper.selectById(id);
    }

}