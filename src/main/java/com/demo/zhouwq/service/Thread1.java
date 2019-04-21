package com.demo.zhouwq.service;

import java.util.concurrent.CountDownLatch;

/**
 * 通过volatile能使一个线程(Thread0)去终止另一个正在运行的线程(hread1)
 */
public class Thread1 implements Runnable {
    private volatile boolean flag = true;

    public void stop(){
        flag = false;
    }

    @Override
    public void run() {
        while(flag)
            System.out.println("我一直在奔跑。。。");
    }
}
