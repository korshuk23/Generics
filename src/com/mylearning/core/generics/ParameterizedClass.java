package com.mylearning.core.generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<Integer> info1 = new Info<>(18);
        System.out.println(info1);
        Integer i = info1.getValue();

        Info<Double> info2 = new Info<>(23.3);
        System.out.println(info2);
        Double d = info2.getValue();

    }
}

class Info<T extends Number & Comparable> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "[" + value + "]";
    }

    public T getValue() {
        return this.value;
    }
}
