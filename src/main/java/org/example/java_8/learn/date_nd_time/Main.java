package org.example.java_8.learn.date_nd_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        // LocalDate
        LocalDate today = LocalDate.now();
        System.out.println(today);
        int dayOfMonth = today.getDayOfMonth();
        Month month = today.getMonth();
        int year = today.getYear();
        LocalDate yesterday = today.minusDays(1);
        if(today.isAfter(yesterday)) {
            System.out.println("han ye shi h ");
        }


        LocalDate customeDate = LocalDate.of(1990, 2, 7);   // custom date making
        System.out.println(customeDate);


        System.out.println("---------------------");

        // LocalTime
        LocalTime now = LocalTime.now();
        System.out.println(now);


        LocalTime customTime = LocalTime.of(13,30,30);   // custom time
        System.out.println(customTime);
        LocalTime parseTime = LocalTime.parse("12:30:34");




        // and so on see document for this
    }
}
