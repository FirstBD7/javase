package com.sinosoft.day02;

public class ThreadDemo extends Thread{
    public void run()
    {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i="+ i);
        }
    }
}
