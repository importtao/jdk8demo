package com.importtao.jdk8demo.methodRefrence;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class MethodRefrenceDemo {
    //List<String> list =  new ArrayList<String>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.forEach(MethodRefrenceDemo::methodRefrenceTest);
        Stream<String> stream = list.stream();
        stream.filter(b -> Integer.parseInt(b) > 1)
                .map(i -> {
                    if (i.equals("2")) {
                        return "Ⅱ";
                    } else {
                        return i;
                    }
                })
                .forEach(MethodRefrenceDemo::methodRefrenceTest);
        Random random = new Random();
        random.ints(999).limit(100).forEach(System.out::println);
    }

    public static void methodRefrenceTest(String s) {
        System.out.println(s);
    }
}
