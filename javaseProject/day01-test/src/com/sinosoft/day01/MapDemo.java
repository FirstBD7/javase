package com.sinosoft.day01;

import java.util.HashMap;

public class MapDemo {
    /**
     *
     //常用方法
     HashMap<String,String> map =new HashMap<>();
     map.put("a","aa");     //put() 向map中添加一组键 值对
     map.remove("a");  //删除指的的键，返回对应的值
     map.clear();     //清空键值对
     map.isEmpty();   //判断键值对的个数是否为空
     map.containsKey("a");    //是否含对应键
     map.containsValue("aaa");//是否含对应值
     map.get("s");    //传键返值
     map.size();      //有几组键值对
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("01", "hello");
        map.put("02", ",");
        map.put("03", "world");
        System.out.println(map.toString());
        System.out.println(map.remove("02"));
        System.out.println(map.toString());
        System.out.println(map.isEmpty());
        System.out.println(map.get("01"));
        System.out.println(map.size());
        map.clear();
        System.out.println(map.isEmpty());
    }
}
