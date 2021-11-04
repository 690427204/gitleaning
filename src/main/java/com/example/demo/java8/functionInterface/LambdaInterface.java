package com.example.demo.java8.functionInterface;

import com.example.demo.java8.default_and_static_function.Java8InterfaceTest;

import java.util.function.Consumer;

@FunctionalInterface
public interface LambdaInterface {

    void print(String s);

   default void defaultPrint(){
       System.out.println("defaultPrint");
   };

   static void staticPrint(LambdaInterface lambdaInterface,String s){
       lambdaInterface.print(s);
   }

    public static void main(String[] args) {

       /* LambdaInterface impl = (s) -> System.out.println(s);
        impl.print("实现");
        impl.defaultPrint();*/

        LambdaInterface.staticPrint(s ->  System.out.println(s),"函数作为参数");
    }

}
