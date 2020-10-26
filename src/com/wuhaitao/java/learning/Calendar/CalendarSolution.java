package com.wuhaitao.java.learning.Calendar;

import java.time.LocalDate;

/**
 * @author wuhaitao
 * @Classname CalendarSolution
 * @Description 打印日历  并标记当前日期
 * 主要使用LocalDate 接口
 * @Date 2020/10/26 15:16
 * @Created by wuhaitao
 */
public class CalendarSolution {
    public static void main(String[] args) {
        //当前时间
        LocalDate date = LocalDate.now();
        //获取当前月份
        int monthValue = date.getMonthValue();
        //获取当前日期
        int dayOfMonth = date.getDayOfMonth();

        //减去当前时间的前一天   得到月初
        date = date.minusDays(dayOfMonth - 1);
        //拿到是星期  对应的数值
        int value = date.getDayOfWeek().getValue();
        //输出 日历表头
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        //输出日期前面的空格
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        //输出月份日期
        while (date.getMonthValue() == monthValue) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == dayOfMonth) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
