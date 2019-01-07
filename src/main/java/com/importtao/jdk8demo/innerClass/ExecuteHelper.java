package com.importtao.jdk8demo.innerClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class ExecuteHelper {
    public static void execute(Execute execute) {
        execute.doExecute();
    }

    public static void execute(Execute execute, String umpKey) {
        System.out.println("start========" + umpKey);
        try {
            execute.doExecute();
        } catch (Exception e) {
            System.out.println("umpKey===>" + umpKey);
        }
        System.out.println("end========" + umpKey);
    }


    private interface Execute {
        void doExecute();
    }

    //测试匿名内部类的使用方式
    public static void main(String[] args) {
        //HashSet hashSet = HashSet::new;
        ExecuteHelper.execute(InterFaceTest::noParam);
        ExecuteHelper.execute(() -> Study.print(), "xxx");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println();
            }
        };

        //测试数组的输出
       /* String[] profiles = {"xxx", "yyyyy", "zzzzzzzzzzzz"};
        Stream.of(profiles).
        String profilesStr = Arrays.stream(profiles).reduce((a, b) -> a + ", " + b).get();
        System.out.println(profilesStr + "=======\n" + Arrays.toString(profiles));*/

    }

    public static class Study {
        public static void print() {
            System.out.println("Hello world*******");
        }
    }

}
