package com.example.springbootdome.controller.admin.vo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@ApiOperation(value = "管理后台 - 学生新增/修改 Request VO")
@Data
public class SaveReqVO {

    @ApiModelProperty(value = "学号", example = "26792")
    private String studentId;

    @ApiModelProperty(value = "名字", example = "李四")
    private String name;

    @ApiModelProperty(value = "年龄")
    private String age;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "学院")
    private String college;

    @ApiModelProperty(value = "系")
    private String department;

}