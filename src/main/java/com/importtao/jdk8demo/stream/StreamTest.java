package com.importtao.jdk8demo.stream;

import com.importtao.jdk8demo.methodRefrence.MethodRefrenceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        Stream<String> stream = list.stream();
        stream.filter(b -> Integer.parseInt(b) > 1)
                .map(i -> {
                    if (i.equals("2")) {
                        return "Ⅱ";
                    } else {
                        return i;
                    }
                })
                .forEach(StreamTest::methodRefrenceTest);
        Random random = new Random();
        random.ints(999).limit(100).forEach(System.out::println);
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        boolean allMatch = intList.stream().allMatch(d->d>2);
        System.out.println("allMatch："+allMatch);
        boolean anyMatch = intList.stream().anyMatch(d->d>2);
        System.out.println("anyMatch："+anyMatch);
        boolean noneMatch = intList.stream().noneMatch(d->d>2);
        System.out.println("noneMatch："+noneMatch);
        intList.stream().flatMapToDouble(i -> {
            double[] dl = new double[i];
            for (int j = 0; j < i; j++) {
                dl[j] = ((double) i * j);
                System.out.println("<<<<"+i+"---"+j+">>>>"+dl[j]);
            }
            return DoubleStream.of(dl);
        }).filter(d-> d>-0.1).forEach(StreamTest::methodRefrenceTest);

    }

    public static void methodRefrenceTest(String s) {
        System.out.println(s);
    }
    public static void methodRefrenceTest(Double s) {
        System.out.println(s);
    }
}
