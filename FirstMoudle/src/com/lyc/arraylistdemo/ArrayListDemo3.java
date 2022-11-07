package com.lyc.arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<User> list  = new ArrayList<>();

        // 如果函数返回值是多个值时，定义一个容器，将其返回

        User u1 = new User("10001","zhangsan","123456");
        User u2 = new User("10002","lisi","12345678");
        User u3 = new User("10003","wangwu","1234qwer");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(contains(list,"10005"));


    }

    public static boolean contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }

}


