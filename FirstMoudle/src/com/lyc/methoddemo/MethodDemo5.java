package com.lyc.methoddemo;

import java.util.Random;
import java.util.Scanner;

public class MethodDemo5 {
    public static void main(String[] args) {
        // 随机5位验证码
        // 长度为5 前四位是大写 or 小写字母 最后一位是数字
        // 思路 从数组中抽取随机索引
//        char [] chs = new char[52];
//        for (int i = 0; i < chs.length / 2; i++) {
//            chs[i] = (char)(97 + i);
//            chs[i+26] = (char) (65 + i);
//        }
//
//        Random r = new Random();
//        String result = "";
//        for (int i = 0;i<4;i++){
//            int randIndex = r.nextInt(chs.length);
//            result += chs[randIndex];
//        }
//        result = result + r.nextInt(10);
//        System.out.println("验证码为：" + result);
//
//        int [] arr1 = {1,2,3,4,5,6};
//        int [] arr2 = copyArray(arr1);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }
//        getScore();
//        numEncode(1983);
//        randSelect();

        int [] arr = createNumber();
        System.out.println("=======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=======================");
        int [] userInputArr = userInputNumber();
        int redCount = 0,blueCount = 0;
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length -1; j++) {
                if (redNumber == arr[j]){
                    redCount++;
                    break;
                }
            }
        }
        int blueNumber = userInputArr[userInputArr.length-1];
        if (blueNumber == arr[arr.length - 1]){
            blueCount++;
        }

        System.out.println("红球个数为: " + redCount + " 蓝球个数为：" + blueCount);

        if (redCount == 6 && blueCount == 1){
            System.out.println("恭喜，中奖1000万！！");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜，中奖500万！！");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜，中奖3000！！");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜，中奖200！！");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜，中奖10！！");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜，中奖5！！");
        } else {
            System.out.println("谢谢参与！！");
        }

//        for (int i = 0; i < chs.length; i++) {
//            System.out.println(chs[i]);
//
//        }
    }

    // 数组复制
    public  static int[] copyArray(int [] array){
        int[]  arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    // 评委打分

    public static void getScore(){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        for (int i = 0;i < 6; ){
            System.out.println("请第"+(i+1)+"位评委输入打分结果：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
                i++;
            } else {
                System.out.println("输入分数有误，当前为第" + (i+1) + "个评委");
            }

        }
        int maxNum = arr[0];
        int minNum = arr[0];
        int avgNum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]){
                maxNum = arr[i];
            }
            if (minNum > arr[i]){
                minNum = arr[i];
            }
            sum += arr[i];
        }
        avgNum = (sum - maxNum - minNum)/(arr.length - 2);
        System.out.println("最终得分为：" + avgNum);
    }

    // 数字加密
    public static void numEncode(int number){
        // 规则 先得到每位数字，然后每一位都+5，再对10求余数，最后将数字反转，得到新数
        // 取出数的每一位
        int count = 0,num = number;
        while (number != 0){
            number /= 10;
            count++;
        }
        int[] array = new int[count];
        int i = count-1;
        while (num != 0){
            array[i] = num % 10;
            num /= 10;
//            System.out.print(array[i] + " ");
            i--;

        }
        // +5 求余
        for (int j = 0; j < array.length; j++) {
            array[j] = (array[j] + 5) % 10;
//            System.out.println(array[j]);
        }

        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[array.length -1 - j];
            array[array.length -1 - j] = temp;
        }
        int result = 0;
        for (int j = 0; j < array.length; j++) {
            result = result*10 + array[j];
        }
        System.out.println("输出结果为：" + result);
    }

    // 随机不重复抽取

    public static void randSelect(){
        // 定义数组奖池
        int []  array = {2,588,888,1000,10000};
        int [] newarr = new int[array.length];
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int randIndex = r.nextInt(5);
            int prize = array[randIndex];
            boolean flag = contains(newarr,prize);
            if (!flag){
                newarr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }

    public static boolean contains(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }

    public  static int[] createNumber(){
        int [] arr = new int[7];
        // 随机生成号码添加至数组中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
           int redNumber = r.nextInt(1,34);
           boolean flag =contains(arr,redNumber);
           if (!flag){
               arr[i] = redNumber;
               i++;
           }
        }
        int blueNumber  = r.nextInt(16)+1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    public static int[] userInputNumber(){
        int [] arr = new  int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i+1) + "个红球的号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33){
                if (!(contains(arr,redNumber))){
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在，请重新输入！！");
                }
            } else {
                System.out.println("输入范围有误！");
            }
        }
        while (true) {
            System.out.println("请输入蓝球号码");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("输入蓝球号码超出范围！");
            }
        }
        return arr;
    }
}
