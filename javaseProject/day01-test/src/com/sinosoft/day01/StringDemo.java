package com.sinosoft.day01;

import java.util.Arrays;

public class StringDemo {
    /**
     * •  int length( )           获取字符串长度
     *
     * •  char charAt( )       获取指定位置上的字符
     *
     * •  int indexOf( )         获取字符首次出现的位置,也可以从指定位置开始查找
     *
     * •  int lastIndexOf( )        从后往前找
     *
     * •  String substring( )    从指定位置开始截取一个字符串副本
     *
     * •  String toUpperCase( )         将字符串内容全部转换为大写
     *
     * •  String toLowerCase( )         将字符串内容全部转换为小写
     *
     * •  String concat(String str)      拼接指定字符串内容到原字符串末尾
     *
     * •  String [ ] split(分割符)           通过分割符将字符串分割并以数组形式返回
     *
     * •  String replace(char old,char new)           单个字符替换(比如"hello"里面的所有l)
     *
     * •  String replace(String old,String new)      整个字符串替换
     *
     * •  replaceAll(String regex, String replacement)      替换字符串中所有数字
     *
     * •  replaceFirst(String regex, String replacement)   替换字符串中第一个数字
     *
     * •  String trim( )     去除字符串两端空格（字符串中间的空格不能去除
     */
    public static void main(String[] args) {
        String str01 = "hello.txt";
        System.out.println(str01.indexOf("."));
        System.out.println(str01.substring(str01.lastIndexOf(".") + 1));
        System.out.println(str01.substring(0, str01.lastIndexOf(".")));
        System.out.println(str01.charAt(5));
        String str02 = str01.toUpperCase();
        System.out.println(str01.toUpperCase());
        System.out.println(str02.toLowerCase());
        System.out.println(str02.concat(".file"));
        System.out.println(str02);
        String[] str03= str01.split("\\.");
        System.out.println(Arrays.toString(str03));
        System.out.println(str01.replace("h", "c"));
        str01 = "hello.txt1100129";
        /**
         * \\d：正则表达式，匹配任意单个数字字符（0-9）
         * "i"：替换目标字符串
         * replaceAll：方法特性是全局替换，会替换所有匹配的子
         */
        System.out.println(str01.replaceAll("\\d", "i"));
        System.out.println(str01.replaceFirst("\\d", "i"));
        str01 = "   hello.txt   ";
        System.out.println(str01.trim());
    }
}
