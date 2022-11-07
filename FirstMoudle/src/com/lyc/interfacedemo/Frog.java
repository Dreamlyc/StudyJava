package com.lyc.interfacedemo;

public class Frog extends Animal implements Swim{


    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("From eat worm");
    }

    @Override
    public void swim() {
        System.out.println("frog breaststroke!!");
    }
}
