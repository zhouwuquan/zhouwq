package com.demo.zhouwq.controller;

import com.demo.zhouwq.dao.ProductMapper;
import com.demo.zhouwq.entity.Product;
import com.demo.zhouwq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/hello")
    public String hello(@RequestParam("idd") String id) {
        //productMapper
        List<Product> list = productService.selectAll();
        System.out.println("111111111111111111111");
        System.out.println("222222222222222222222");
        System.out.println("4444444444444444444444");
        System.out.println("333333333333333333333");
        //TODO
        return "hello zhouwq" + id + Arrays.toString(list.toArray());
    }

    public void test(){
    //TODO
    }

}
