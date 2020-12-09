package com.yzz.study.ClassUse;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

/**
 * 时间类的操作与使用 UTC指的是1970年1月1日 00:00:00
 */
public class DateTest {

    public static void main(String[] args) {
        //表示时间点
        Date date = new Date();
        //Mon Dec 07 22:50:37 CST 2020
        System.out.println(date);
        System.out.println(date.toString());

        //表示日历
        LocalDate now = LocalDate.now();
        //获取年份 2020
        int year = now.getYear();
        //获取月份 12
        int monthValue = now.getMonthValue();
        LocalDate localDate = LocalDate.of(2020,12, 07);
        //获取一年之内的今天天数 342
        int dayOfYear = localDate.getDayOfYear();
        //获取一月之内的今天天数 7
        int dayOfMonth = localDate.getDayOfMonth();
        //获取以周为单位的今天表示 MONDAY
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(year);
        System.out.println(monthValue);
        System.out.println(dayOfYear);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek.toString());
    }
}
