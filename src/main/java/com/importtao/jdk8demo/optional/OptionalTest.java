package com.importtao.jdk8demo.optional;

import com.importtao.jdk8demo.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
    /**
     *      Optional.of(T t); // 创建一个Optional实例
     *      Optional.empty(); // 创建一个空的Optional实例
     *      Optional.ofNullable(T t); // 若T不为null，创建一个Optional实例，否则创建一个空实例
     *      isPresent();    // 判断是够包含值
     *      orElse(T t);   //如果调用对象包含值，返回该值，否则返回T
     *      orElseGet(Supplier s);  // 如果调用对象包含值，返回该值，否则返回s中获取的值
     *      map(Function f): // 如果有值对其处理，并返回处理后的Optional，否则返回Optional.empty();
     *      flatMap(Function mapper);// 与map类似。返回值是Optional
     *
     *      总结：Optional.of(null)  会直接报NPE
     */

    
    public static void main(String[] args) {
        Optional<TestModel> op = Optional.of(new TestModel());
        System.out.println(op.get());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<test1>>>>>>>>>>>>>>>>>>>>>>>>>>");
        // NPE
        //Optional<TestModel> op2 = Optional.of(null);
        //System.out.println(op2);
        //System.out.println("<<<<<<<<<<<<<<<<<<<<<<test2>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Optional<Object> op3 = Optional.empty();
        System.out.println(op);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<test3>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // No value present
        System.out.println(op.get());
        Optional<TestModel> op4 = Optional.ofNullable(new TestModel());
        System.out.println(op.get());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<test4>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Optional<Object> op5 = Optional.ofNullable(null);
        System.out.println(op5);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<test5>>>>>>>>>>>>>>>>>>>>>>>>>>");

        // System.out.println(op2.get());
        Optional<TestModel> op6 = Optional.ofNullable(new TestModel());
        System.out.println(op6.orElse(new TestModel()));
        System.out.println(op6.orElse(null));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<test6>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Optional<TestModel> op7 = Optional.of(new TestModel());
        op7 = Optional.empty();
        TestModel TestModel = op7.orElseGet(() -> new TestModel());
        System.out.println(TestModel);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<test7>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Optional<TestModel> op8 = Optional.of(new TestModel());
        System.out.println(op8.map( (e) -> e.getS()).get());


    }

}
