package com.importtao.jdk8demo.other;

public class OtherTest {
    public static void main(String[] args) {
        String [] sa = {"1","2","3"};
        String sjoin = String.join("|",sa);
        System.out.println(sjoin);
        System.out.println(Integer.BYTES+"byte");
        System.out.println(Integer.SIZE+"bit");
    }
}
