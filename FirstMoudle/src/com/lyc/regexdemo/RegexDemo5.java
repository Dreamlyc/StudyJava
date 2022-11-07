package com.lyc.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        String str1 = "95年java问世，有很多版本，abbbbbbbbbbbbbbaaaaaaaaaaaa 最常用的是Java8和JAva11,是长期支持版本，下一个是JAVa17，不久奖励啊JAVA17也ok";

        /*
        *  只写+和*表示贪婪匹配
        *  +？ 非贪婪匹配
        *  *？ 非贪婪匹配
        * 贪婪爬取：在爬取数据时尽可能的多爬取数据
        * 非贪婪爬取：在爬取数据的时候尽可能少爬取数据
        * ab+  abbbbbbbbbbbbb
        * ab  ab
        * 默认是贪婪爬取，如果我们在数量词+*的后面加上问号，那么此时就是非贪婪爬取
        * */
        String regex = "ab+?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str1);
        while (m.find()){
            System.out.println(m.group());
        }

    }
}
