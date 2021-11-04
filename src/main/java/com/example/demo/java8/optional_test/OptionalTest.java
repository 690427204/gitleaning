package com.example.demo.java8.optional_test;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

public class OptionalTest {


    public static void main(String[] args) {

        Integer a = null;
        Integer b = new Integer(10);

        Optional<Integer> optionala = Optional.ofNullable(a);
        System.out.println("a isPresent :"+optionala.isPresent());

        Optional<Integer> optionalb = Optional.ofNullable(b);
        System.out.println("b isPresent :"+optionalb.isPresent());


        Integer integera = optionala.orElse(new Integer(20));
        System.out.println(integera);
        Integer integerb = optionalb.orElse(new Integer(20));
        System.out.println(integerb);

        Integer orElseGet = optionala.orElseGet(() -> Integer.valueOf("2222"));

    }

}
