package com.example.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTist {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("bb");
        list.add("cc");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("bb")){
                iterator.remove();
            }
        }

    }

}
