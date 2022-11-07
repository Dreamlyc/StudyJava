package com.lyc.interfacedemo;

public class Test {

    public static void main(String[] args) {
        Frog f = new Frog("f1",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();
    }
}
