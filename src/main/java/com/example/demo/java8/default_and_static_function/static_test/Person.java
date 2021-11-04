package com.example.demo.java8.default_and_static_function.static_test;

/**
 * 静态方法引用
 */

import java.util.*;
import java.util.stream.Collectors;

public class Person {

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static int compareTo(Person a, Person b){
        return  a.age.compareTo(b.age);
    }

    public static void main(String[] args) {

       /* Person person = new Person();
        person = new Person();*/

        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer1==integer2);
        Person[] personArray = new Person[30];
        //java7,需要定义一个Comparator的实现类
        Arrays.sort(personArray,new PersonCompare());

        //java8
        Arrays.sort(personArray,(a,b)->Person.compareTo(a,b));
        //或者
        Arrays.sort(personArray,Person::compareTo);

        List<Person> persons = new ArrayList();
        List<Person> uniqueByName = persons.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getName))), ArrayList::new)
        );

    }

    public static class PersonCompare implements Comparator<Person> {
        @Override
        public int compare(Person a, Person b) {
            return Person.compareTo(a,b);
        }
    }

}


