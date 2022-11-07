package com.lyc.orderdemo;

import java.util.Scanner;

public class ProcessDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入酒量：");
//        int wine = sc.nextInt();
//        if (wine > 2){
//            System.out.println("！！！！！");
//        }
//        else {
//            System.out.println("？？？？？");
//        }
        System.out.println("请输入成绩");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {

            if (score >= 90 && score <= 100) {
                System.out.println("优秀");
            } else if (score >= 80 && score < 90) {
                System.out.println("良好");
            } else if (score >= 70 && score < 80) {
                System.out.println("合格");
            } else {
                System.out.println("不合格");
            }
        } else {
            System.out.println("输入成绩不合法！！");
        }
    }
}
