package com.lyc.staticdemo;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "lyc";
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(18);
        s1.setGender("男");
//        s1.teacherName = "LYC";

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(17);
        s2.setGender("女");

        s2.study();
        s2.show();


    }
}
