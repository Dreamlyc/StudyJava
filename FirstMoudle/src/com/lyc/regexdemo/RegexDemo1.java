package com.lyc.regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        // 规则：全部是数字，6-20位，不能以0开头
        String qq = "123456789";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }
}
