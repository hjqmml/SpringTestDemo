package com.example.springbootdome.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootdome.model.DO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper extends BaseMapper<DO> {

}
