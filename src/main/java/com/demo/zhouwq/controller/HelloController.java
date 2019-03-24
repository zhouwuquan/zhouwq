package com.demo.zhouwq.controller;

import com.demo.zhouwq.dao.ProductMapper;
import com.demo.zhouwq.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private ProductMapper productMapper;

    @RequestMapping("/hello")
    public String hello(@RequestParam("idd") String id){
        //productMapper
        List<Product> list = productMapper.selectAll();
        System.out.println("111111111111111111111");
        return "hello zhouwq"+id+ Arrays.toString(list.toArray());
    }

}
