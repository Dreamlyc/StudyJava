package com.lyc.methoddemo;

public class MethodDemo2 {
    public static void main(String[] args) {
//        int [] arr1 = new int[5];
        int [] arr1 = {11,22,33,44,55};
        int [] arr2 = {1,2,3,4,5,6,7,8,9};
        printArr(arr1);
        System.out.println();
        System.out.println(getArrMax(arr1));
        System.out.println(contains(arr1,50));
        printArr(copyArray(arr2,3,5));
//        System.out.println("abc");  // 打印完abc，然后换行
//        System.out.print("abc");  // 只打印不换行
//        System.out.println();  // 不打印任何数据，只做换行处理

    }

    // 定义数组遍历的方法
    public static void printArr(int[] arr){
        System.out.print('[');
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print(']');
    }

    public static int getArrMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    // 复制数组
    public static int[] copyArray(int [] array,int from,int to){
        int [] arr1 = new int[to - from];
        for (int i = from,j = 0; i < to; i++) {
                arr1[j] = array[i];
                j++;
            }
        return arr1;
        }
}
