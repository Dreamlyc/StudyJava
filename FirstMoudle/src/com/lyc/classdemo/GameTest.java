package com.lyc.classdemo;

public class GameTest {
    public static void main(String[] args) {
        GameRole r1 = new GameRole("乔峰",100,'男');
        GameRole r2 = new GameRole("鸠摩智",100,'男');
        r1.showUserInfo();
        r2.showUserInfo();
        while (true){
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() +"K.O了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() +"K.O了" + r1.getName());
                break;
            }
        }
    }
}
