package com.example.springbootdome.kafka;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONSupport;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson2.JSON;
import com.example.springbootdome.controller.order.vo.OrderSaveReqVO;
import com.example.springbootdome.service.order.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author xingyu4j
 * @data 2024/1/9,20:21
 */
@Component
@Slf4j
public class KafkaConsumer {

    @Resource
    private OrderService orderService;

    @KafkaListener(topics = "testhj")
//    public void topic_test(ConsumerRecord<?,?> record, Acknowledgment ack, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){
    public void topic_test(String message){

        OrderSaveReqVO orderSaveReqVO = JSON.parseObject(message, OrderSaveReqVO.class);
        //OrderSaveReqVO orderSaveReqVO = (OrderSaveReqVO)JSON.parse(message);
        orderService.createOrder(orderSaveReqVO);
//        Optional message = Optional.ofNullable(message.value());
//        if (message.isPresent()){
//            Object msg = message.get();
            log.info("topic.group1消费了：Topic:" + message + ",Message:" + message);
//            ack.acknowledge();
//        }
    }
   /* @KafkaListener(topics = KafkaProducer.TOPIC_TEST,groupId = KafkaProducer.TOPIC_GROUP2)
    public void topic_test1(ConsumerRecord<?,?> record, Acknowledgment ack,@Header(KafkaHeaders.RECEIVED_TOPIC) String topic){
        Optional message = Optional.ofNullable(record.value());
        if(message.isPresent()){
            Object msg = message.get();
            log.info("topic.group1消费了：Topic:" + topic + ",Message:" + msg);
            ack.acknowledge();
        }
    }*/

}