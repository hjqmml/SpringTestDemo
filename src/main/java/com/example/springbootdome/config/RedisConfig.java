package com.example.springbootdome.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
    @Bean
    public KeyGenerator keyGenerator(){
        return new KeyGenerator(){
            @Override
            public Object generate(Object target, Method method, Object...params){
                StringBuilder sbuilder = new StringBuilder();
                sbuilder.append(target.getClass().getName());
                sbuilder.append(method.getName());
                for (Object obj:params) {
                    sbuilder.append(obj.toString());
                }
                return sbuilder.toString();
            }
        };
    }
}
