package com.lyc.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        // Pattern:表示正则表达式
        // Matcher:文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。在大串中去找符合匹配规则的子串
        Pattern p = Pattern.compile("Java\\d{0,2}");
        String str = "95年Java问世，有很多版本，最常用的是Java8和Java11,是长期支持版本，下一个是Java17，不久奖励啊Java17也ok";
        Matcher m = p.matcher(str);
//        boolean b = m.find();  // 记录了子串的起始和终止索引加一，后续可以利用subString进行截取
//        String s1 = m.group();
//        System.out.println(s1);

        while (m.find()){
            String s =  m.group();
            System.out.println(s);
        }

    }
}
