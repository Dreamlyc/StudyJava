package com.lyc.datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // 会根据系统的不同时区来获取不同的日历对象
        // 会把时间中的纪元、年、月、日、时、分、秒、星期、等放到数组中
        // 修改一下日历代表的时间
        // 月份0-11
        // 星期 ：周日作为每周第一天
        // 索引：
        // 0：纪元  1：年   2：月   3：一年中第几周   4： 一个月中的第几周    5：一个月中的第几天（日期）
        // 索引对应有常量
        Date d = new Date(0L);
        c.setTime(d);
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,11);
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
    }
}
