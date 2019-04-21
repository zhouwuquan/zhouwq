package com.demo.zhouwq.controller;

import com.demo.zhouwq.entity.Product;
import com.demo.zhouwq.service.ProductService;
import com.demo.zhouwq.service.Thread0;
import com.demo.zhouwq.service.Thread1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CountDownLatch;

@RestController
public class VolatileController {
    private Thread1 t1;

    @Autowired
    private ProductService productService;

    @RequestMapping("/make")
    public String makeThreadByVolatile() throws InterruptedException {
        //启动一直会运行的线程
        t1 = new Thread1();
        Thread tt1 = new Thread(t1);
        tt1.start();
        return "1";
    }

    @Scheduled(fixedRate = 3000)
    public void task(){
        System.out.println("3秒定时任务====================================================");
        List<Product> list = productService.selectAll();
        for (Product p:list){
            if("g".equals(p.getCode())){
                //去终止Thead1不断运行的线程
                Thread0 t0 = new Thread0(t1);
                Thread tt2 = new Thread(t0);
                tt2.start();
            }
        }
    }
}
