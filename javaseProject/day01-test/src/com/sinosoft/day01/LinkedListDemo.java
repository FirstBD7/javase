package com.sinosoft.day01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    /**
     * 添加元素
     * add(E element): 在链表末尾添加元素
     * add(int index, E element): 在指定位置插入元素
     * addFirst(E element): 在链表头部添加元素
     * addLast(E element): 在链表尾部添加元素
     * 获取元素
     * get(int index): 获取指定位置的元素
     * getFirst(): 获取第一个元素
     * getLast(): 获取最后一个元素
     * 删除元素
     * remove(int index): 删除指定位置的元素
     * remove(Object o): 删除第一次出现的指定元素
     * removeFirst(): 删除第一个元素
     * removeLast(): 删除最后一个元素
     * 修改元素
     * set(int index, E element): 替换指定位置的元素
     * 查找方法
     * indexOf(Object o): 返回指定元素第一次出现的索引
     * lastIndexOf(Object o): 返回指定元素最后一次出现的索引
     * contains(Object o): 判断是否包含指定元素
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add(",");
        list.add("world");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.contains("hi"));
        System.out.println("***********");
        for(String str : list)
        {
            System.out.println(str);
        }
        System.out.println("***********");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("***********");
        ListIterator<String> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
