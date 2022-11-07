package com.lyc.interfacedemo;

public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("dog eat bone");
    }

    @Override
    public void swim() {
        System.out.println("Dog paddle");

    }
}
