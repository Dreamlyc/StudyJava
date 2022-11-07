package com.lyc.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
//        int [] arr = {1,2,3};
//        System.out.println(arrToString(arr));
//        System.out.println(stringReverse("abc"));
        int money;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额输入无效！！");
            }
        }
        int temp = money;
        String moneyStr = "";
        while (temp != 0){
            int res = temp % 10;
            String captialNum =  getCaptialNum(res);
            moneyStr = captialNum + moneyStr;
            temp /= 10;
        }

        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = getCaptialNum(0) + moneyStr;
        }


        String [] arr = {"佰","拾","萬","仟","佰","拾","圆"};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result +  (c + arr[i]);
        }
        System.out.println(result);
    }

    public static String arrToString(int [] arr){
        if (arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                result = result + (arr[i] + ", ");
            } else {
                result = result + arr[i];
            }
        }
        return result+"]";
    }

    public static String stringReverse(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }

    public static String getCaptialNum(int number){
        String [] arr= {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
