package com.mylearning.core.generics.practice.pair;

/**
 * Создайте параметризованный класс Pair, который принимает два параметра типа.
 * Он должен иметь методы getFirst и getSecond, которые возвращают первый
 * и второй параметры соответственно. Создайте объект Pair с двумя параметрами типа String,
 * получите их и выведите на экран.
 */
public class Pair<T, U> {
    private T item1;
    private U item2;

    public Pair(T item1, U item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getFirst() {
        return item1;
    }

    public U getSecond() {
        return item2;
    }

    @Override
    public String toString() {
        return "[" + item1 + ", " + item2 + "]";
    }

    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("first", "second");
        String first = pair.getFirst();
        String second = pair.getSecond();
        System.out.println(first + " " + second);
    }
}
