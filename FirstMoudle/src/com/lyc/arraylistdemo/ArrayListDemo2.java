package com.lyc.arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Student> list1 = new ArrayList<>();
        Student s1 = new Student("zhangsan",24);
        Student s2 = new Student("lisi",26);
        Student s3 = new Student("wangwu",25);

        list1.add(s1);
        list1.add(s2);
        list1.add(s3);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1){
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");

        for (int i = 0; i < list1.size(); i++) {
            Student stu = list1.get(i);
            System.out.println(stu.getName() + ", "+ stu.getAge());
        }



    }

}
