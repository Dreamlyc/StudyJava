package com.lyc.arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 创建集合的对象
        // 泛型：限定集合中存储的数据类型
//        ArrayList <String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();  // JDK8
        System.out.println(list);  // 打印不是地址值，java底层进行处理，打印为存储的数据内容，以[]包裹

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        list.remove("aaa");
        System.out.println(list);
        String str = list.remove(0);
        System.out.println(str);
        System.out.println(list.set(0,"eee"));
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
