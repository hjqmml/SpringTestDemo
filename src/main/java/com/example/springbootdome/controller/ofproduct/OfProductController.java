package com.example.springbootdome.controller.ofproduct;

import com.example.springbootdome.commen.util.BeanUtils;
import com.example.springbootdome.controller.ofproduct.vo.OfProductRespVO;
import com.example.springbootdome.controller.ofproduct.vo.OfProductSaveReqVO;
import com.example.springbootdome.model.ofproduct.OfProductDO;
import com.example.springbootdome.service.ofproduct.OfProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.*;


@Api(value = "管理后台 - 用户购买的商品",tags = "管理后台 - 用户购买的商品")
@RestController
@RequestMapping("/account/of-product")
@Validated
public class OfProductController {

    @Resource
    private OfProductService ofProductService;

    @PostMapping("/create")
    @ApiOperation(value = "创建用户购买的商品",notes = "创建用户购买的商品")
    public String createOfProduct(@Valid @RequestBody OfProductSaveReqVO createReqVO) {
        return ofProductService.createOfProduct(createReqVO);
    }

    @PutMapping("/update")
    @ApiOperation(value = "更新用户购买的商品",notes = "更新用户购买的商品")
    public Boolean updateOfProduct(@Valid @RequestBody OfProductSaveReqVO updateReqVO) {
        ofProductService.updateOfProduct(updateReqVO);
        return true;
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除用户购买的商品",notes = "删除用户购买的商品")
    public Boolean deleteOfProduct(@RequestParam("id") String id) {
        ofProductService.deleteOfProduct(id);
        return true;
    }

    @GetMapping("/get")
    @ApiOperation(value = "获得用户购买的商品",notes = "获得用户购买的商品")
    public OfProductRespVO getOfProduct(@RequestParam("id") String id) {
        OfProductDO ofProduct = ofProductService.getOfProduct(id);
        return BeanUtils.toBean(ofProduct, OfProductRespVO.class);
    }

}