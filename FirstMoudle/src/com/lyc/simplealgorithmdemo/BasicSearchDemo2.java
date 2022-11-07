package com.lyc.simplealgorithmdemo;

import java.util.ArrayList;

public class BasicSearchDemo2 {
    public static void main(String[] args) {
        int [] arr = {131,127,147,81,131,103,23,7,79};
        System.out.println(basicSearch(arr,131));
    }

    private static ArrayList<Integer> basicSearch(int[] arr, int number) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                list.add(i);
            }
        }
        return list;
    }
}
