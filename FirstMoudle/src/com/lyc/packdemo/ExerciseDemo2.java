package com.lyc.packdemo;

public class ExerciseDemo2 {
    public static void main(String[] args) {
        // 实现parseInt方法的效果
        // 字符串只能有数字 最少1为 最多10位 0不能开头
        String str = "123456789";

        // 字符串异常过滤
        if(!(str.matches("[1-9]\\d{0,9}"))){
            System.out.println("数据格式有误");
        } else {
            System.out.println("数据格式正确");
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                number = number * 10 + c;
            }
            System.out.println(number+1);
        }



    }
}
