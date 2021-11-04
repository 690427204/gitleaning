package com.example.demo.java8.default_and_static_function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Java8InterfaceTestImpl implements Java8InterfaceTest {

    @Override
    public void print() {
        System.out.println("子类重写的方法");
    }

    public int getAge(){
        return 2;
    }

    public static void main(String[] args) {
        new Java8InterfaceTestImpl().print();
        Java8InterfaceTest.staticPrint();
        Consumer<Java8InterfaceTest> print = Java8InterfaceTest::print;

        Function<Java8InterfaceTestImpl, Integer> getAge = Java8InterfaceTestImpl::getAge;

    }

}
