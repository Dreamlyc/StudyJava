package com.lyc.package_test;

import java.util.Scanner;

public class ValueDemo2 {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);  // 11
        ++a;
        System.out.println(a);  // 12
        a--;
        System.out.println(a);  // 11
        --a;
        System.out.println(a);  // 10

        int b = 10,c = 10;
        System.out.println(b++);  // 10
        System.out.println(++c);  // 11

        int x = 10,y = 20;
        x += y;
        System.out.println(x);

        System.out.println(a);
        System.out.println( a>2 || (a<a++));
        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();

        boolean result = num1 == 6 || num2 == 6 || (num1+num2) % 6 == 0;
        System.out.println("结果为" + result);
        System.out.println("输入两个数中的最大值为：");
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);


        int height1 = 150,height2 = 210,height3 = 165;

        int temp = height1 > height2 ? height1 : height2;
        int max1 = temp > height3 ? temp : height3;
        System.out.println(max1);

    }
}
