//package com.example.springbootdome.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.ParameterBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.schema.ModelRef;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.Parameter;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@EnableSwagger2
//@Configuration
//public class Swagger2Config {
//    /**
//     * 启动的时候装载bean，才会运行这段代码，不然不会运行，除非前台调用
//     * @return
//     */
//    @Bean
//    public Docket CreatRestApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.springbootdome.controller.admin"))    //controller包路径
//                .paths(PathSelectors.any())    //
//                .build()
//                .globalOperationParameters(setGlobalParameters());
//    }
//
//    /**
//     * 项目接口文档的描述
//     * */
//    public ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title("SpringBootDome项目接口文档")
//                .description("本文档描述SpringBootDome项目接口定义")
//                .version("1.0")
//                .termsOfServiceUrl("") //文档生成的主页地址
//                .contact(new Contact("demo",null,"xxx"))
//                .build();
//    }
//
//    /**
//     * 设置全局参数
//     */
//    public List<Parameter> setGlobalParameters(){
//        List<Parameter> globalParameterList = new ArrayList<>();
//        //header中的token参数，可填可不填，一般业务登录拦截器校验token是否合法
//        ParameterBuilder tokenBuilder = new ParameterBuilder();
//        tokenBuilder.name("token")
//                .description("用户token参数")
//                .required(false)  //非必填
//                .modelRef(new ModelRef("string"))   //数据类型
//                .parameterType("header");  //参数类型
//        globalParameterList.add(tokenBuilder.build());
//        return globalParameterList;
//    }
//}
