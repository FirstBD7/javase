package com.sinosoft.day01;

public class StringBufferDemo {
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
    public static void main(String[] args) {
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
}
