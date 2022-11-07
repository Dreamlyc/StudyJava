package com.lyc.regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        // 根据正确的数据从左到右依次去写。
        // (?i)abc 忽略abc的大小写
        String regex1 = "1[3-9]\\d{9}"; // 手机号码
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("010-63246783".matches(regex2));
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";  // 邮箱
        System.out.println("12345@qq.com.cn".matches(regex3));

        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        String regex5 = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0\\d|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        String regex6 = "[1-9]\\d{16}(\\d|X|x)";  //"[1-9]\\d{16}(\\d|X|x)";"[1-9]\\d{16}[\\dXx]";"[1-9]\\d{16}(\\d|(?i)x)";

        System.out.println("410322195802306126".matches(regex5));

        // 前6位：省，市，区 派出所等
        // 年 18 19 20  + 任意数字出现两次

    }
}
