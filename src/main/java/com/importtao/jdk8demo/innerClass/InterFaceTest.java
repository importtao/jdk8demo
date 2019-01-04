package com.importtao.jdk8demo.innerClass;
@FunctionalInterface
public interface InterFaceTest {
    static void noParam(){
        System.out.println("noParam");
    };
    String paramAndReturn(String s);
}
