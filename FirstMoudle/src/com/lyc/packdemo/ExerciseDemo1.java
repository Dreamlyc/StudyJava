package com.lyc.packdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseDemo1 {
    public static void main(String[] args) {
        // 键盘录入一些1-100的整数，并添加到集合中，直到集合中的数据和超过200

        // 1.创建集合
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if (num<1 || num>100){
                System.out.println("数据不在1-100中");
                continue;
            }
            list.add(num);
            int sum = getSum(list);
            if (sum>200){
                System.out.println("数据和已经满足要求");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum += num;
        }
        return sum;
    }
}
