package com.lyc.classdemo;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        gf.setName("ZY");
        gf.setAge(18);
        gf.setGender("女");

        System.out.println(gf.getName());
        System.out.println(gf.getAge());
        System.out.println(gf.getGender());

        gf.eat();
        gf.sleep();
    }
}
