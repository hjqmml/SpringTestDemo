package com.example.springbootdome.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@Configuration
@EnableCaching
public class RedisConfig {
    /**
     * 对RedisTemplate的key,value进行序列化
     * @param redidConnectionFactory
     * @return
     */
    @Bean
    public RedisTemplate<String ,String> redisTemplate(LettuceConnectionFactory redidConnectionFactory){
       RedisTemplate<String,String> redisTemplate = new RedisTemplate<>();
       //序列化
       redisTemplate.setKeySerializer(new StringRedisSerializer());
       redisTemplate.setValueSerializer(new StringRedisSerializer());
       redisTemplate.setHashKeySerializer(new StringRedisSerializer());
       redisTemplate.setHashValueSerializer(new StringRedisSerializer());
       redisTemplate.setConnectionFactory(redidConnectionFactory);
       return redisTemplate;
   }
}
