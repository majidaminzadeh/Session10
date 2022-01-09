package com.tosan.example4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
//        String[] strings = new String[10];
        List<String> list = new ArrayList();
        List<String> list1 = new LinkedList<>();
        list1.add("str1");
        list1.add("str2");
        list1.add("str3");
        System.out.println("Size is " + list1.size());
        list1.add("str4");
        list1.add("str5");
        list1.add("str6");
        System.out.println("Size is " + list1.size());
        list1.add("str7");
        list1.add("str8");
        System.out.println("Size is " + list1.size());

        for (String str : list1){
            System.out.println(str);
        }
    }
}
