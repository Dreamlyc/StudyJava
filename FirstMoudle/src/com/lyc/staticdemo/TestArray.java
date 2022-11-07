package com.lyc.staticdemo;

public class TestArray {
    public static void main(String[] args) {
        // 测试工具类
//        int [] arr1 = {1,2,3,4,5};
//        double [] arr2 = {1.5,3.7,4.9,5.8,6.6};
//        String str = ArrayUtil.printArr(arr1);
//        System.out.println(str);
//        double avg = ArrayUtil.getAverage(arr2);
//        System.out.println(avg);
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
