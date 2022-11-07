package com.lyc.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) throws ParseException {

        // 默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(0L);
        String str = sdf.format(d);
        System.out.println(str);

        // 指定格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);

        String str2 = "2020-11-11 11:11:11";
        // 创建的对象格式要跟字符串的格式完全一致
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(str2);
        System.out.println(d2);

        String str3 = "2000-11-11";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date d3 = sdf3.parse(str3);
        // 格式化
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy年MM月dd");
        String result = sdf4.format(d3);
        System.out.println(result);








    }
}
