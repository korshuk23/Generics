package com.mylearning.core.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        //List<Number> list = new ArrayList<Integer>();
        //List<Objects> list = new ArrayList<Integer>();
        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();
        //list.add(22);

        List<Double> list1 = new ArrayList<>();
        list1.add(1.23);
        list1.add(3.68);
        list1.add(5.73);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("goodbye");
        showListInfo(list2);

        List<Integer> ald = new ArrayList<>();
        ald.add(3);
        ald.add(4);
        ald.add(3);
        System.out.println(sum(ald));
    }

    static void showListInfo(List<?> list) {
        System.out.println("My list contains some elements: " + list);
    }

    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum+=n.doubleValue();
        }
        return sum;
    }

}
