package com.example.springbootdome.service.order;

import com.alibaba.fastjson2.JSON;
import com.example.springbootdome.commen.util.BeanUtils;
import com.example.springbootdome.controller.order.vo.OrderSaveReqVO;
import com.example.springbootdome.mapper.order.OrderMapper;
import com.example.springbootdome.model.order.OrderDO;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;
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
    @Resource
    private RedisTemplate redisTemplate;

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
        OrderDO order = new OrderDO();
        if (Objects.nonNull(redisTemplate.opsForValue().get(id))){
            Object str = redisTemplate.opsForValue().get(id);
            order = JSON.parseObject(str.toString(),OrderDO.class);
        }else {
            order = orderMapper.selectById(id);
            redisTemplate.opsForValue().set(id,JSON.toJSONString(order));
        }
        return order;
    }

}