package com.lycjava.demo1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据：");
        int number = sc.nextInt();
        while (number != 0){
            int result = number % 10;
            number = number / 10;
            System.out.println(result);
        }
    }
}
