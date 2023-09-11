package com.mylearning.core.generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(2);
        int a = getSecondElement(al1);
        System.out.println(a);
        List<String> al2 = new ArrayList<>();
        al2.add("abc");
        al2.add("def");
        al2.add("ghi");
        String s = getSecondElement(al2);
        System.out.println(s);
    }

    public static <T> T getSecondElement(List<T> list) {
        return list.get(1);
    }
}
