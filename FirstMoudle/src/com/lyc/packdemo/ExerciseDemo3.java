package com.lyc.packdemo;

public class ExerciseDemo3 {
    public static void main(String[] args) {
        // 实现toBinaryString方法，将十进制数转换为字符串
        String result = toBinaryString(123);
        System.out.println(result);
        System.out.println(Integer.toBinaryString(123));


    }
    public static String toBinaryString(int number){
        StringBuilder sb = new StringBuilder();
        while (true){
            if (number == 0){
                break;
            }
            // 获取余数 %
            int remaindar = number % 2;
            sb.insert(0,remaindar);
            // System.out.println(remaindar);
            number = number / 2;
        }
        return sb.toString();
    }
}
