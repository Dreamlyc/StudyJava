package com.lyc.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        // 链式编程
        // 在调用方法时，不需要定义变量去接收其结果，而继续调用其他方法。

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入字符串");
//        String str = sc.next();
//        StringBuilder sb = new StringBuilder();
//        if (sb.append(str).reverse().toString().equals(str)){
//            System.out.println("对称");
//        } else {
//            System.out.println("不对称！");
//        }
        int[] arr = {1,2,3};
        System.out.println(arrToString(arr));

    }

    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.append("]").toString();
    }
}
