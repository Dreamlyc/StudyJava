package com.lyc.polymorphism;

public class Test {
    public static void main(String[] args) {

        Person s = new Student();
        s.setAge(18);
        s.setName("zhangsan");

        Person t = new Teacher();
        t.setName("wjg");
        t.setAge(30);

        Person a = new Administrator();
        a.setName("gly");
        a.setAge(37);

        register(s);
        register(t);
        register(a);

    }

    public static void register(Person p){
        p.show();
    }
}
