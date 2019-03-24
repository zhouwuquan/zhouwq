package com.demo.zhouwq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.demo.zhouwq.dao")
public class ZhouwqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhouwqApplication.class, args);
    }

}
