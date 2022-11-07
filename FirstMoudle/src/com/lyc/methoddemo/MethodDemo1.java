package com.lyc.methoddemo;

public class MethodDemo1 {
    public static void main(String[] args) {
//        playGame();
        sumInt(10,20);
//        getLength(1.2,1);
//        getArea(1.5);
        int res = sumReturn(1,2,3);
        System.out.println(res);
        sumInt(1,2,3);
    }

    // 定义方法
    public static void playGame(){
        System.out.println("步骤1");
        System.out.println("步骤2");
        System.out.println("步骤3");
        System.out.println("步骤4");
    }

    public static void sumInt(int num1,int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void sumInt(int num1,int num2,int num3){
        int res = num1 + num2 + num3;
        System.out.println(res);
    }

    public static void getLength(double len,double width){
        double result = (len + width) * 2;
        System.out.println(result);
    }

    public static void getArea(double radius){
        double result = radius * radius * Math.PI;
        System.out.println(result);
    }

    // 带有返回值的方法
    public static int sumReturn(int a,int b,int c){
        int result = a + b + c;
        return result;
    }

    public static double getRecArea(double length,double width){
        double result = length * width;
        return result;
    }
    public static boolean compareArea(){
        return false;
    }

}
