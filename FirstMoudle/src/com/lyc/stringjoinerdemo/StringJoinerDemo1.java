package com.lyc.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
        int [] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        System.out.println(sj);
    }
}
