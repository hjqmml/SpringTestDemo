package com.example.springbootdome.model;

import lombok.*;
import com.baomidou.mybatisplus.annotation.*;

/**
 * 学生 DO
 *
 * @author h
 */
@TableName("students")
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class DO  {

    /**
     * 学号
     */
    @TableId(type = IdType.INPUT)
    private String studentId;
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private String age;
    /**
     * 性别
     */
    private String sex;
    /**
     * 学院
     */
    private String college;
    /**
     * 系
     */
    private String department;

}