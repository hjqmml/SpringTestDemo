package com.example.springbootdome.service.ofproduct;

import com.example.springbootdome.controller.ofproduct.vo.OfProductSaveReqVO;
import com.example.springbootdome.model.ofproduct.OfProductDO;

import javax.validation.*;

/**
 * 用户购买的商品 Service 接口
 *
 * @author 芋道源码
 */
public interface OfProductService {

    /**
     * 创建用户购买的商品
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    String createOfProduct(@Valid OfProductSaveReqVO createReqVO);

    /**
     * 更新用户购买的商品
     *
     * @param updateReqVO 更新信息
     */
    void updateOfProduct(@Valid OfProductSaveReqVO updateReqVO);

    /**
     * 删除用户购买的商品
     *
     * @param id 编号
     */
    void deleteOfProduct(String id);

    /**
     * 获得用户购买的商品
     *
     * @param id 编号
     * @return 用户购买的商品
     */
    OfProductDO getOfProduct(String id);


}