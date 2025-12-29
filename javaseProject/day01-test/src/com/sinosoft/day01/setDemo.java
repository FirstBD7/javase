package com.sinosoft.day01;

import java.util.HashSet;

public class setDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("hello");
        set.add(",");
        set.add("world");
        System.out.println(set.toString());
    }
}
