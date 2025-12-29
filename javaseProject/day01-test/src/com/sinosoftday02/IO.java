package com.sinosoftday02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class IO {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        byte[] arr = {91,92,93,94,95};
        if(file.exists())
        {
            System.out.println(file.getName());
        }
        FileOutputStream fos = new FileOutputStream(file, true);
        fos.write("hello world      ".getBytes());
        fos.write(arr);
        fos.close();
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
