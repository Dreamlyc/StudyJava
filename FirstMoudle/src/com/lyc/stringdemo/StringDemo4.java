package com.lyc.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'){
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {  // 48--57
                number++;
            }
        }
        System.out.println("大写字母个数为：" + bigCount + "小写字母个数为：" + smallCount + "数字的个数为：" + number);
    }
}
