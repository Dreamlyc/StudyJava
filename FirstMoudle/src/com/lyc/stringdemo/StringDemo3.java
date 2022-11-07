package com.lyc.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入字符串");
//        String str1 = sc.next();
//        String str2 = "abc";
//        System.out.println(str1 == str2);
        String rightUserId = "lyc";
        String rightPassword = "123456";
        int i = 0;
        while (i<3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String userid = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if ((userid.equals(rightUserId)) && (password.equals(rightPassword))) {
                System.out.println("用户登录成功！");
                break;
            } else {
                System.out.println("用户登录失败！"+"还剩下 " +(2-i)+"次机会！");
            }
            i++;
        }

    }
}
