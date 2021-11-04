package com.example.demo.java8.default_and_static_function;

public interface Java8InterfaceTest {

    default void print(){
        System.out.println("java8接口默认方法");
    }

    static void staticPrint(){
        System.out.println("java8接口静态方法");
    }

}
