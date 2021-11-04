package com.example.demo;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SetTest {

    public static void main(String[] args) {

        Set<Object> set = new HashSet<>();

        set.add("11");

        HashMap<Object, Object> map = new HashMap<>();

        Arrays.asList("啊","b","c").forEach(e-> System.out.println(e));
        Arrays.asList(1,2,3).forEach((Integer e)-> {
            System.out.println(e);
            System.out.println("---");
        });

        Runnable r1 = ()-> System.out.println("啊啊啊啊啊");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("额鹅鹅鹅");
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.shutdown();

    }

}
