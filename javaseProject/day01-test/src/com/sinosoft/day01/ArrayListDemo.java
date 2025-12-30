package com.sinosoft.day01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<String> list01 = new ArrayList<>();
        list.add("hello");
        list.add(",");
        list.add("world");
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(list.indexOf(","));
        System.out.println(list);
        list.set(list.indexOf("hello"), "hi");
        System.out.println(list);
        System.out.println(list.size());



    }
}
