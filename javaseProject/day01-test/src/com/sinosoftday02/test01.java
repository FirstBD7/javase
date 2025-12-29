package com.sinosoftday02;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test01 {
    public static void main(String[] args) {
        System.out.println("hello world");
        test01 t = new test01();
        t.threadPoolTest();
    }

    public void threadPoolTest(){
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(3);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.SECONDS, queue);
        for (int i = 0; i < 9; i++) {
            threadPoolExecutor.submit(()->{
               System.out.println("hello world");
            });
        }
    }
}
