package com.lyc.classdemo;

public class Student {

    private String name;
    private int age;

    // 如果我们自己没有写任何构造方法
    // 虚拟机会给我们加一个空参构造方法
    public Student(){
        System.out.println("空参构造方法");
    }

    // 有参构造
    public Student(String name,int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
