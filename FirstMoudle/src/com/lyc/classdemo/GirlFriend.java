package com.lyc.classdemo;

public class GirlFriend {

    private String name;
    private int age;
    private String gender;

    // 对于每一个私有的成员变量，都需要提供get和set方法
    // set方法：给成员变量赋值
    // get方法：对外提供成员变量的值
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age >= 18 && age <=50){
            this.age = age;
        } else {
            System.out.println("非法数据");
        }
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public  void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleep");
    }

}
