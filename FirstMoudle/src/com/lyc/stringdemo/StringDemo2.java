package com.lyc.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
       String s1 = new String("abc");
       String s2 = "abc";
       String s3 = "Abc";
       System.out.println(s1==s2); //false

        boolean result1 = s1.equals(s2);
        System.out.println(result1);  // true

        boolean result2 = s1.equals(s3);
        System.out.println(result2);  // false

        boolean result3 = s1.equalsIgnoreCase(s3);  // true
        System.out.println(result3);
    }
}
