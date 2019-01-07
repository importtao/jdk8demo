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

public class MethodRefrenceDemo<R> {
    //List<String> list =  new ArrayList<String>();

    public static void main(String[] args) {
       /* List<String> list = new ArrayList<String>();
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
                }).forEach(MethodRefrenceDemo::methodRefrenceTest);*/
        Random random = new Random();
        List<Long> randomList = new ArrayList<Long>();
        for(int i=0;i<999;i++) randomList.add(random.nextLong());
        Long t1 = System.currentTimeMillis();
        //random.ints(999).limit(100).forEach(System.out::println);
        randomList.stream().map(o->{System.out.println(o);return o*2;}).limit(6).count();
        Long t2 = System.currentTimeMillis();
        int i=0;
        for(Long l:randomList){
            randomList.set(i,l*2);
            i++;
        }
        Long t3 = System.currentTimeMillis();
        System.out.println(t2-t1-(t3-t2));

    }

    public static void methodRefrenceTest(String s) {
        System.out.println(s);
    }

    public  R get(List<R> l){
        return null;
    }
}
