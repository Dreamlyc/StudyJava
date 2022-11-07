package com.lyc.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 数组的静态初始化
        int [] array1 = {1,2,3,4,5,6,7,8,9,10};
        String [] array2 = {"张三","李四","王五"};
        double [] array3 = {11.2,2.2,3.1};
        System.out.println(array1[0]);  // 1
        System.out.println(array1);  // [I@16b98e56
        // [I@16b98e56
        // [:表示当前是一个数组，I：表示当前数组元素都是整型（int）的。
        // @:间隔符  16b98e56：地址值，十六进制数
//        for (int i = 0;i<4;i++){
//            System.out.println(array1[i]);
//        }
        // 获取数组的长度 数组名.length
       /* for(int i = 0;i<array1.length;i++){
            System.out.println(array1[i]);
        }*/

        // idea提供的快速遍历方式
        // 数组名.fori
 /*       int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println(sum);*/

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%3==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
