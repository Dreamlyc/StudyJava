package com.lyc.staticdemo;

import java.util.ArrayList;

public class StudentTest2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("zhangsan",23,"男");
        Student stu2 = new Student("lisi",20,"女");
        Student stu3 = new Student("wangwu",21,"男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int maxAgeStudent = StudentUtil.getMaxStudent(list);
        System.out.println(maxAgeStudent);
    }


}
