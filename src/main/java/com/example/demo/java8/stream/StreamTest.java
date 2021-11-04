package com.example.demo.java8.stream;

import com.example.demo.java8.default_and_static_function.static_test.Person;
import com.example.demo.java8.functionInterface.LambdaInterface;

import java.net.CookieManager;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
    new HashMap<Person,String>();
        Random random = new Random();
        random.ints(10,1,10).forEach((i)-> System.out.print(i+","));
        random.ints().limit(10).forEach((i)-> System.out.print(i+","));

        System.out.println("\n------------------");
        List<Integer> integers = Arrays.asList(2, 3, 4, 11, 6, 3, 1, 3);
        List<Integer> collect = integers.stream().map((i) -> i * i).collect(Collectors.toList());
        collect.forEach(i-> System.out.print(i+","));

        //过滤重复 .distinct()
        List<Integer> integers2 = Arrays.asList(2, 3, 4, 11, 6, 3, 1, 3);
        integers2.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        List<Person> persons =  Arrays.asList(
                new Person("张三",10),
                new Person("李四",30),
                new Person("李四",20),
                new Person("王五",20));

        //筛选年龄大于10的人
        List<Person> persons2 = persons.stream().filter(i -> i.getAge() > 10).collect(Collectors.toList());
        persons2.forEach(p-> System.out.println(p.getName()+",年龄"+p.getAge()));
        //打印所有人的名字
        List<String> personNames = persons.stream().map(Person::getName).collect(Collectors.toList());
        personNames.forEach(System.out::println);

        persons.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);

        Map<String, Person> collect1 = persons.stream().collect(Collectors.toMap(Person::getName, Function.identity(),(p1,p2)->p2));

        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
    }

}
