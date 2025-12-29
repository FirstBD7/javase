package com.sinosoft.day01;

public class MathDemo {
    /**
     *  ○   abs         绝对值
     *  ○   sqrt         平方根
     *  ○   pow(double a, double b)      a的b次幂
     *  ○   max(double a, double b)      min(double a, double b)     比较两数的大小
     *  ○   random( )                               返回 0.0 到 1.0 的随机数
     *  ○   long  round(double a)           double型的数据a转换为long型（四舍五入）
     */
    public static void main(String[] args) {
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
}
