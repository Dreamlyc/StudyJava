package com.lyc.inheritancedemo;

public class Test {
    public static void main(String[] args) {
//        Ragdoll rd = new Ragdoll();
//        rd.catchMouse();
//        rd.eat();
//        rd.drink();
//        Husky h = new Husky();
//        h.breakHome();
//        h.eat();
//        h.drink();
//        h.lookhome();
        Husky h = new Husky();
        h.lookhome();
        h.eat();
        h.drink();
        h.breakHome();

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookhome();
    }
}
