package com.demo.zhouwq.controller;

import com.demo.zhouwq.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot整合redis
 */
@RestController
public class RedisController {

    @Autowired
    private RedisOperator redisOperator;

    @RequestMapping("/redis")
    public String redisTest(){
        redisOperator.set("HK:288", "1", 10);
        String value = redisOperator.get("HK:288");
        if(StringUtils.isEmpty(value)){
            System.out.println("为空:"+value);
        }else{
            System.out.println("不为空:"+value);
        }
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String value1 = redisOperator.get("HK:288");
        if(StringUtils.isEmpty(value1)){
            System.out.println("为空:"+value1);
        }else{
            System.out.println("不为空:"+value1);
        }

        return value+"======"+value1;
    }
}
