package com.lyc.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {

        // 找质数 101~200
        // 2 ~ 根号number之间
        int count = 0;
        for (int i = 101;i <= 200;i++){
            boolean flag = getPrimeNumber(i);
            if (flag){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("质数个数为: " + count);
    }

    public static boolean getPrimeNumber(int number){

        for (int i = 2;i <= Math.sqrt(number);i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
}
