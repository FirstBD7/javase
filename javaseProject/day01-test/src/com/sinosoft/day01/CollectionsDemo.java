package com.sinosoft.day01;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add(",");
        list.add("world");
        Collections.reverse(list);
        System.out.println(list);
    }
}
