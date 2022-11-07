package com.lyc.methoddemo;

import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        // 机票价格计算
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int price = sc.nextInt();
        System.out.println("请输入当前月份：");
        int mouth = sc.nextInt();
        System.out.println("请输入当前购买的舱位:0--头等舱，1--经济舱");
        int seat = sc.nextInt();

        if (mouth >= 5 && mouth <= 10){
            // 旺季
            if (seat == 0){
                price = (int) (price * 0.9);
            } else if (seat == 1){
                price = (int) (price * 0.85);
            } else {
                System.out.println("没有这个舱位。");
            }
//            price = calPrice(price,seat,0.9,0.85);

        } else if ((mouth >= 1 && mouth <= 4) || (mouth >= 11 && mouth <=12)){
            // 淡季
            if (seat == 0){
                price = (int) (price * 0.7);
            } else if (seat == 1){
                price = (int) (price * 0.65);
            } else {
                System.out.println("没有这个舱位。");
            }
//            price = calPrice(price,seat,0.7,0.65);
        } else {
            System.out.println("月份不合法");
        }
        System.out.println("机票价格是：" + price);
    }
    public static int calPrice(int price,int seat,double v0,double v1){
        if (seat == 0){
            price = (int) (price * v0);
        } else if (seat == 1){
            price = (int) (price * v1);
        } else {
            System.out.println("没有这个舱位。");
            return -1;
        }
        return price;
    }
}

// idea中 ctrl+alt+M 自动抽取方法