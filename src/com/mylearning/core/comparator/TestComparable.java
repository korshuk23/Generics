package com.mylearning.core.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Elena");
        list.add("Anatoliy");
        list.add("Andrei");
        list.add("Ivan");
        System.out.println("Before sorting: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting: ");
        System.out.println(list);
    }
}
