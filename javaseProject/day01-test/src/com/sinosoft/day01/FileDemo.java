package com.sinosoft.day01;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("a.txt");
        if(file.exists())
        {
            System.out.println(file.getName());
        }
        else{
            try{
                file.createNewFile();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
