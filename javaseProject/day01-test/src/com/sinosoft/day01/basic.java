package com.sinosoft.day01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        basic h = new basic();
        //h.arrTest();
        //h.stringTest();
        //h.stringBufferTest();
        //h.mathTest();
        //h.dateTest();
        //h.arrayListTest();
        //h.linkedListTest();
        //h.setTest();
        //h.mapTest();
        //h.collectionsTest();
        //h.fileTest();
    }

    /**
     * public StringBuffer append(String str)         在原字符串末尾添加字符串
     *
     * public StringBuffer insert(int offset,String str)    向指定位置插入字符串
     *
     * public StringBuffer deleteCharAt(int index)      删除单个字符
     *
     * public StringBuffer delete(int start,int end)       删除指定区间的元素，不包含结尾
     *
     * 功能: 将从 start 到 end-1 的字符替换为指定字符串
     * 区间: [start, end) - 包含起始位置，不包含结束位置
     * public StringBuffer replace(int start,int end,String str)  替换
     *
     * public StringBuffer reverse()  反转
     *
     * 从StringBuffer中截取一个副本，返回给一个新的String对象，StringBuffer对象不变
     *
     * String 和 StringBuffer 的区别
     * 1. 可变性
     * String：不可变对象，每次修改都会创建新的字符串对象
     * StringBuffer：可变对象，直接在原对象上进行修改
     * 2. 性能特点
     * String：
     * 频繁修改时性能较差（产生大量临时对象）
     * 占用更多内存（每次修改都创建新对象）
     * StringBuffer：
     * 频繁修改时性能更好
     * 内存使用更高效
     * 3. 线程安全性
     * String：线程安全（不可变性保证）
     * StringBuffer：线程安全（内部使用同步方法）
     */
    private void stringBufferTest()
    {
        StringBuffer sb01 = new StringBuffer();
        sb01.append("hello");
        sb01.append("world");
        System.out.println(sb01);
        System.out.println(sb01.insert(sb01.indexOf("w"), ","));
        System.out.println(sb01.deleteCharAt(sb01.indexOf("d")));
        System.out.println(sb01.delete(sb01.indexOf("h"), sb01.lastIndexOf(",") + 1));
        System.out.println(sb01);
        sb01.append("hello,world");
        System.out.println(sb01);
        System.out.println(sb01.replace(sb01.indexOf("w"), sb01.lastIndexOf("l"), "o"));
        System.out.println(sb01.reverse());
        String str01 = sb01.toString();
        System.out.println(str01);
        String str02 = sb01.substring(sb01.indexOf("d"), sb01.lastIndexOf("l"));
        System.out.println(str02);
    }

    /**
     *  ○   abs         绝对值
     *  ○   sqrt         平方根
     *  ○   pow(double a, double b)      a的b次幂
     *  ○   max(double a, double b)      min(double a, double b)     比较两数的大小
     *  ○   random( )                               返回 0.0 到 1.0 的随机数
     *  ○   long  round(double a)           double型的数据a转换为long型（四舍五入）
     */
    private void mathTest()
    {
        int a = -10;
        System.out.println(Math.abs(a));
        a = Math.abs(a);
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a,2));
        System.out.println(Math.max(a, 1000));
        System.out.println(Math.min(a, 10 * Math.random()));
        System.out.println(Math.round(10.7));
        System.out.println(Math.round(10.4));
        System.out.println(Math.floor(10.7));
    }

    private void dateTest()
    {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString().replaceAll("\\d","time"));
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }

    private void arrayListTest()
    {
        ArrayList<String> list = new ArrayList<>();
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
    private void linkedListTest()
    {
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

    private void setTest()
    {
        HashSet set = new HashSet();
        set.add("hello");
        set.add(",");
        set.add("world");
        System.out.println(set.toString());
    }

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
    private void mapTest()
    {
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

    private void collectionsTest()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add(",");
        list.add("world");
        Collections.reverse(list);
        System.out.println(list);
    }

    private void fileTest()
    {
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
