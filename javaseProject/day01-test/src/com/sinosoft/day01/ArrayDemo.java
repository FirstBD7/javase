package com.sinosoft.day01;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        String[] str = new String[5];
        str[0] = "hello";
        String[] str01 = {
                "hello", "you", "me"
        };
        int[] arr01 = {};
        String[] str02 = {};
        System.out.println(str[0]);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(str01));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
    }
}
