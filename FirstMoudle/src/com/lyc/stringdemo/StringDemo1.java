package com.lyc.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        // 1.直接赋值
        String s1 = "hello world";
        System.out.println(s1);

        // 2.new
        String s2 = new String();
        System.out.println("@"+s2+"!");  // ""

        String s3 = new String("abc");
        System.out.println(s3);

        char[] chs = {'a','b','c','d','e'};
        String  s4 = new String(chs);
        System.out.println(s4);

        byte[] bytes = {97,98,99};
        String s5 = new String(bytes);
        System.out.println(s5);



    }
}
