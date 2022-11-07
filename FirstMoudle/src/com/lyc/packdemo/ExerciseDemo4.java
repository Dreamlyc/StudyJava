package com.lyc.packdemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class ExerciseDemo4 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2000,1,1);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.DAYS.between(ld1,ld2);
        System.out.println(days);

        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        LocalDate ld3 = LocalDate.of(2000,3,1);
        LocalDate ld4 = ld3.minusDays(1);
        System.out.println(ld4.getDayOfMonth());


        System.out.println(ld3.isLeapYear());

    }
}
