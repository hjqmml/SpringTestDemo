package com.example.springbootdome.service.ofproduct;

import com.example.springbootdome.commen.util.BeanUtils;
import com.example.springbootdome.controller.ofproduct.vo.OfProductPageReqVO;
import com.example.springbootdome.controller.ofproduct.vo.OfProductSaveReqVO;
import com.example.springbootdome.mapper.ofproduct.OfProductMapper;
import com.example.springbootdome.model.ofproduct.OfProductDO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

/**
 * 用户购买的商品 Service 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class OfProductServiceImpl implements OfProductService {

    @Resource
    private OfProductMapper ofProductMapper;

    @Override
    public String createOfProduct(OfProductSaveReqVO createReqVO) {
        // 插入
        OfProductDO ofProduct = BeanUtils.toBean(createReqVO, OfProductDO.class);
        ofProductMapper.insert(ofProduct);
        // 返回
        return ofProduct.getProductId();
    }

    @Override
    public void updateOfProduct(OfProductSaveReqVO updateReqVO) {
        // 更新
        OfProductDO updateObj = BeanUtils.toBean(updateReqVO, OfProductDO.class);
        ofProductMapper.updateById(updateObj);
    }

    @Override
    public void deleteOfProduct(String id) {
        // 删除
        ofProductMapper.deleteById(id);
    }


    @Override
    public OfProductDO getOfProduct(String id) {
        return ofProductMapper.selectById(id);
    }

}