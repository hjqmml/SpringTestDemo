package com.example.springbootdome.controller.order;

import com.example.springbootdome.commen.util.BeanUtils;
import com.example.springbootdome.controller.order.vo.OrderRespVO;
import com.example.springbootdome.controller.order.vo.OrderSaveReqVO;
import com.example.springbootdome.model.order.OrderDO;
import com.example.springbootdome.service.order.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import javax.validation.*;

@Api(value = "管理后台 - 用户订单",tags = "管理后台 - 用户订单")
@RestController
@RequestMapping("/user/order")
//@Validated
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("/create")
    @ApiOperation(value = "创建用户订单",notes = "创建用户订单")
    public String createOrder(@Valid @RequestBody OrderSaveReqVO createReqVO) {
        return orderService.createOrder(createReqVO);
    }

    @PutMapping("/update")
    @ApiOperation(value = "更新用户订单",notes = "更新用户订单")
    public Boolean updateOrder(@Valid @RequestBody OrderSaveReqVO updateReqVO) {
        orderService.updateOrder(updateReqVO);
        return true;
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除用户订单",notes = "删除用户订单")
    public Boolean deleteOrder(@RequestParam("id") String id) {
        orderService.deleteOrder(id);
        return true;
    }

    @GetMapping("/get")
    @ApiOperation(value = "获得用户订单",notes = "获得用户订单")
    public OrderRespVO getOrder(@RequestParam("id") String id) {
        OrderDO order = orderService.getOrder(id);
        return BeanUtils.toBean(order, OrderRespVO.class);
    }

}