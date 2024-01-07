package com.example.springbootdome.controller.admin;

import com.example.springbootdome.controller.admin.vo.RespVO;
import com.example.springbootdome.controller.admin.vo.SaveReqVO;
import com.example.springbootdome.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Api(value = "students",tags = {"管理后台 - 学生"})
@RestController
@RequestMapping("/students")
public class Controller {

    @Resource
    private TestService testService;

    @PostMapping("/create")
    @ApiOperation(value = "创建",notes = "创建")
    public String create(@Valid @RequestBody SaveReqVO createReqVO) {
        return testService.create(createReqVO);
    }

    @PutMapping("/update")
    @ApiOperation(value = "维护",notes = "维护")
    public Boolean update(@Valid @RequestBody SaveReqVO updateReqVO) {
        testService.update(updateReqVO);
        return true;
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除",notes = "删除")
    public Boolean delete(@RequestParam("id") String id) {
        testService.delete(id);
        return true;
    }

    @GetMapping("/get")
    @ApiOperation(value = "查询",notes = "插些")
    public RespVO get(@RequestParam("id") String id) {
        return null;
    }


}