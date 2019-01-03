package com.importtao.jdk8demo.lambda;

public class lambda {
    public static void main(String[] args) {
        String test = "test";

        Runnable runnable = () -> System.out.println(test);
        Thread thread = new Thread(runnable);
        thread.start();
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(test);
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
