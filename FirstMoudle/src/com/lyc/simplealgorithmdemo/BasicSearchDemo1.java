package com.lyc.simplealgorithmdemo;

public class BasicSearchDemo1 {
    public static void main(String[] args) {

        int [] arr = {131,127,147,81,103,23,7,79};
        System.out.println(basicSearch(arr,131));

    }

    public static boolean basicSearch(int [] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }

    public static int basicSearchIndex(int [] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }
}
