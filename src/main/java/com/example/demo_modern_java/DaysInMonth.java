package com.example.demo_modern_java;

import java.time.Month;
import java.time.Year;

public class DaysInMonth {
    public  static  int getDaysV2(Month month, int year){
        return  switch (month){
            case SEPTEMBER , APRIL, JUNE, NOVEMBER-> 30;
            case FEBRUARY -> Year.isLeap(year)?29:28;
            default -> 31;
        };
    }
    public  static int getDaysV3(Month month, int year){
        return  switch (month){
            case SEPTEMBER , APRIL, JUNE, NOVEMBER -> 30;
            case FEBRUARY ->  {
                System.out.println(""+ month);
                yield  Year.isLeap(year)?29:28;
            }
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER ->  31;
        };
    }
}
