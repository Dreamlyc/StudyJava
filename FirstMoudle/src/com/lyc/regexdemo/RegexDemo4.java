package com.lyc.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {
        String str = "95年Java问世，有很多版本，最常用的是Java8和Java11,是长期支持版本，下一个是Java17，不久奖励啊Java17也ok";
        String str1 = "95年java问世，有很多版本，最常用的是Java8和JAva11,是长期支持版本，下一个是JAVa17，不久奖励啊JAVA17也ok";
        // 1.定义正则表达式
        String regex = "(?i)Java(?=8|11|17)";  // ?表示前面的数据，含有后续信息
        String regex1 = "(?i)Java(8|11|17)";
        String regex2 = "(?i)Java(?:8|11|17)";  // 获取整体所有的  拼接后面的信息
        String regex3 = "(?i)Java(?!8|11|17)";  // 去除后续
        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(str1);
        while (m.find()){
            System.out.println(m.group());
        }

    }
}
