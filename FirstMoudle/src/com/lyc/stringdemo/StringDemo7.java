package com.lyc.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
//        System.out.println(rotate(strA));
        System.out.println(check(strA,strB));
         // 字符串旋转


    }

    public  static String rotate(String str){

        // 截取
        String end = str.substring(1);
        char first = str.charAt(0);
        return end + first;
    }

    public  static String rotate2(String str){

        // 字符数组
        char [] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
           arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
        String result = new String(arr);
        return result;

    }

    public  static  boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate2(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

}
