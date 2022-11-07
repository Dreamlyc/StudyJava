package com.lyc.orderdemo;

import java.util.Random;
import java.util.Scanner;

public class ForWhileDemo {
    public static void main(String[] args) {
//        for (int i = 0;i < 10;i++){
//            System.out.println("hello world!!");
//        }
//        for (int i = 1;i<=5;i++){
//            System.out.println(i);
//        }
//        for (int i = 5;i > 0;i--){
//            System.out.println(i);
//        }
//        int sum = 0;
////        for (int i = 1;i<=100;i++){
////            sum += i;
////        }
//        for (int i = 1;i<=100;i++){
//            if (i%2==0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);

//        int count = 0;
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入区间最小值：");
//        int min1 = sc.nextInt();
//        System.out.println("请输入区间最大值：");
//        int max1 = sc.nextInt();
//
//        for (int i = min1;i<=max1;i++){
//            if(i%3==0 & i%5==0){
//                count += 1;
//                System.out.println(i);
//            }
//        }
//        System.out.println(count);

//        int i = 1;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }
//        int count = 0;
//        double current = 0.1,qumlangma = 8844430;
//        while (current<=qumlangma){
//            current *= 2;
//            count ++;
//        }
//        System.out.println(count);

        // 回文整数：数字倒过来和原本一致
//        System.out.println("请输入数据");
//        int x = sc.nextInt();
//        int temp = x;
//        int num = 0;
//        while (x!=0){
//            int a = x % 10;
//            x /= 10;
//            num = num * 10 + a;
//        }
//        if (temp == num){
//            System.out.println("是回文数！！");
//        } else {
//            System.out.println("不是回文数！！");
//        }

        // 不使用 * / % 计算商和余数

        /*
        * 分析：
        * 使用减法，计算减的次数
        * */
//        System.out.println("请输入被除数：");
//        int dividend = sc.nextInt();
//        System.out.println("请输入除数：");
//        int divisor = sc.nextInt();
//        int count = 0;
//        while (dividend >= divisor){
//            dividend = dividend - divisor;
//            count++;
//        }
//        System.out.println(count);
//        System.out.println(dividend);

        /*// 逢7过
        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
            if (i%10==7 || i/10%10==7 || i%7==0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }*/


        //*******求平方根***********
        /*System.out.println("请输入数据：");
        int num1 = sc.nextInt();
        for (int i = 1; i <= num1; i++) {
            if (i*i == num1){
                System.out.println(i+"是"+num1 + "的平方根");
                break;
            } else if (i*i > num1){
                System.out.println((i-1) + "是" + num1 + "平方根的整数部分");
                break;
            }
        }*/

        //*******求质数***********
        /*System.out.println("请输入数据：");
        int num1 = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i < num1; i++) {  // Math.sqrt(num1)
            if (num1 % i == 0) {
//                System.out.println(num1 + "为合数");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(num1 + "为质数");
        } else {
            System.out.println(num1 + "为合数");
        }*/
        Random r = new Random();
        int number = r.nextInt(0,100)+1;  // [,)

        while (true){
            int inp = sc.nextInt();
            if (inp>number){
                System.out.println("大了");
            } else if (inp < number) {
                System.out.println("小了");
            } else  {
                System.out.println("答对了");
                break;
            }
        }
    }
}
