package com.example.springbootdome.service;

import com.example.springbootdome.controller.admin.vo.SaveReqVO;
import com.example.springbootdome.model.DO;
import org.springframework.stereotype.Service;


/**
 * 学生 Service 实现类
 *
 * @author h
 */
@Service
public class ServiceImpl implements TestService {

//    @Resource
//    private TestMapper testMapper;

    @Override
    public String create(SaveReqVO createReqVO) {
        // 插入
//        DO   = BeanUtils.toBean(createReqVO, DO.class);
//        Mapper.insert();
//        // 返回
        return null;
    }

    @Override
    public void update(SaveReqVO updateReqVO) {

        // 更新
//     更新   DO updateObj = BeanUtils.toBean(updateReqVO, DO.class);
//        Mapper.updateById(updateObj);
    }

    @Override
    public void delete(String id) {
        // 校验存在
//        validateExists(id);
//        // 删除
//        Mapper.deleteById(id);
    }



    @Override
    public DO get(String id) {
        return null;
    }


}