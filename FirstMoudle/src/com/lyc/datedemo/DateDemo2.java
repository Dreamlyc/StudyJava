package com.lyc.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {
        // 比较两个时间 解析时间转换为毫秒值
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:0:0";
        String orderStr = "2023年11月11日 0:01:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        if (orderTime >= startTime && orderTime <= endTime){
            System.out.println("参与成功");
        } else {
            System.out.println("参与失败");
        }
    }
}
