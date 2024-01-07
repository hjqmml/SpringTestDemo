package com.example.springbootdome.mapper.ofproduct;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootdome.model.ofproduct.OfProductDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户购买的商品 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface OfProductMapper extends BaseMapper<OfProductDO> {

}