package com.lyc.inheritancedemo;

public class Dog extends Animal{

    public void lookhome(){
        System.out.println("看家！");
    }

    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }
}
