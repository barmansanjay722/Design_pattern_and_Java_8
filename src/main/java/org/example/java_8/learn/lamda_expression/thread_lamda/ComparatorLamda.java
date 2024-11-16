package org.example.java_8.learn.lamda_expression.thread_lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorLamda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(8);
        list.add(99);
        list.add(1);
        list.add(34);
        Collections.sort(list, (a, b) -> b - a);   // descending sort, happen by Comparator interface in colloection
        System.out.println(list);
    }
}



// Tree Set use for ordering