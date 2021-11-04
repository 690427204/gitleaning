package com.example.demo.java8.date_time;

import com.example.demo.java8.default_and_static_function.Java8InterfaceTestImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Test {

    public static void main(String[] args) {

        String a = "a";
        String b = a;
        a = a+"b";
        System.out.println(b);

        StringBuffer sb1 = new StringBuffer("sb1");
        StringBuffer sb2 = sb1;
        sb1.append("2");
        System.out.println(sb2);
        sb2.append("3");
        System.out.println(sb1);

        int i1 = 1;
        int i2 = i1;
        i1 = 2;
        System.out.println(i2);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(now.toLocalDate());

        LocalDate locallDate =  LocalDate.now();
        System.out.println(locallDate);

        Month month = locallDate.getMonth();
        System.out.println(month.getValue());


    }

    public <E> void getA(){}
}
