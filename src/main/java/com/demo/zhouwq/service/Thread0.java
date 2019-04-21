package com.demo.zhouwq.service;

import java.util.concurrent.CountDownLatch;

/**
 * 通过volatile能使一个线程(Thread0)去终止另一个正在运行的线程(hread1)
 */
public class Thread0 implements Runnable{
    private Thread1 t;

    public Thread0(Thread1 t) {
        this.t = t;
    }

    @Override
    public void run() {
        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t.stop();//终止线程Thread1
    }
}
