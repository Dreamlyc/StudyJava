package com.lyc.regexdemo;

public class RegexDemo6 {
    public static void main(String[] args) {
        // 字符开始与结束是否一致，单个字符
        String regex1 = "(.).+\\1";  // \\组号，表示将对应组号的数据再使用一次
        // 字符开始与结束是否一致，多个字符
        String regex2 = "(.+).+\\1";
        // 字符开始与结束是否一致，开始部分内部每个字符也需要一致
        String regex3 = "((.)\\2*).+\\1";

        String str = "我要学学编编编编程程程程程";

        // (.)重复内容的第一个字符看作一组 +表示至少一次
        //

        String result = str.replaceAll("(.)\\1+","$1");
        System.out.println(result);


    }
}
