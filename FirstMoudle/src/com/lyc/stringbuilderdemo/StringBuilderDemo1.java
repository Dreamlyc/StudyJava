package com.lyc.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123");

        // 添加元素
        sb.append(1);
        sb.append(1.3);
        sb.append(true);
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        sb.reverse();
        int len = sb.length();
        System.out.println(len);

        String str = sb.toString();

        System.out.println(str);

        System.out.println(sb);  // StringBuilder为java中已经写好的类，底层进行处理，打印结果不是地址值，而是属性值
    }
}
