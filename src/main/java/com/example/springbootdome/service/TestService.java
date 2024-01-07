package com.example.springbootdome.service;


import com.example.springbootdome.controller.admin.vo.SaveReqVO;
import com.example.springbootdome.model.DO;

import javax.validation.Valid;


/**
 * 学生 Service 接口
 *
 * @author 芋道源码
 */
public interface TestService {

    /**
     * 创建学生
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    String create(@Valid SaveReqVO createReqVO);

    /**
     * 更新学生
     *
     * @param updateReqVO 更新信息
     */
    void update(@Valid SaveReqVO updateReqVO);

    /**
     * 删除学生
     *
     * @param id 编号
     */
    void delete(String id);

    /**
     * 获得学生
     *
     * @param id 编号
     * @return 学生
     */
    DO get(String id);


}