package com.sinosoft.day01;

import java.util.*;


public class SetDemo {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("hello");
        set.add(",");
        set.add("world");
        System.out.println(set.toString());

        Set<String> blackUidSet = new HashSet<>();
        blackUidSet.add("00001");
        blackUidSet.add("00002");
        blackUidSet.add("00003");
        blackUidSet.add("00004");

        boolean isBlack = blackUidSet.contains(("00001"));
        System.out.println(isBlack);

        for(String kuid : blackUidSet)
        {
            System.out.println(kuid);
        }

        Iterator<String> iterator = blackUidSet.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        int size = blackUidSet.size();
        boolean isEmpty = blackUidSet.isEmpty();
        System.out.println("size:" + size);
        System.out.println("isEmpty:" + isEmpty);
        blackUidSet.clear();
    }
}
