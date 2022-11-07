package com.lyc.arraydemo;

import java.util.Random;

public class ArrayDemo2 {
    public static void main(String[] args) {
//        int [] array = new int[5];
//        String [] array1 = new String[5];
//        System.out.println(array[0]);
//        System.out.println(array1[0]);
        // 数组默认初始化值规律
        // 整型类型：默认初始化值为0
        // 浮点数类型：默认初始化值为0.0
        // 字符类型：默认初始值为'/u0000' 空格
        // 布尔类型：默认初始化值为false
        // 引用数据类型：默认初始化值为null
        //-------求最值--------------------//
/*        int [] arr1 = {33,5,22,44,55};
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (max < arr1[i]){
                max = arr1[i];
            }
        }
        System.out.println(max);*/

        //--------------求和、平均值、统计值---------------//

//        int [] arr2 = new int[10];
//        Random r = new Random();
//
//        for(int i = 0;i<arr2.length;i++){
//            arr2[i] = r.nextInt(1,101);
//        }
//        int max = arr2[0],avg = 0,count = 0,sum = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i]>max){
//                max = arr2[i];
//            }
//            sum += arr2[i];
//        }
//        avg = sum/arr2.length;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i]<avg){
//                count++;
//            }
//        }
//        System.out.println("和为"+sum);
//        System.out.println("最大值为"+max);
//        System.out.println("平均值为"+avg);
//        System.out.println("比平均值小的个数为"+count);


        //-------交换数组中的数据-------//
        int [] arr3 = {1,2,3,4,5,6};

//        for (int i = 0; i < (int)(arr3.length / 2); i++) {
//            int temp = arr3[i];
//            arr3[i] = arr3[arr3.length -1 - i];
//            arr3[arr3.length -1 - i] = temp;
//        }
//        for (int i = 0,j = arr3.length-1;i < j;i++,j--){
//            int temp = arr3[i];
//            arr3[i] = arr3[j];
//            arr3[j] = temp;
//        }

//        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(arr3[i]);
//        }

        // ------ 打乱数组中的数据---与随机索引交换
        int [] arr4 = {1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr4.length; i++) {
            int randindex = r.nextInt(0, arr4.length);
            int temp = arr4[i];
            arr4[i] = arr4[randindex];
            arr4[randindex] = temp;
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }



    }
}
