package com.mylearning.core.generics.practice.pair;

/**
 * Создайте класс PairUtil, который имеет статический метод swap, принимающий на вход два объекта типа Pair<T, T>.
 * Метод должен менять местами значения первого и второго параметров и возвращать модифицированный объект Pair.
 * Создайте объект Pair с параметрами типа Integer, поменяйте местами его значения и выведите на экран.
 */
public class PairUtil {
    public static <T> Pair<T, T> swap(Pair<T, T> pair) {
        T first = pair.getFirst();
        T second = pair.getSecond();
        return new Pair<>(second, first);
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> pair2 = new Pair<>(5, 10);
        System.out.println("Original Pair: " + pair2);

        Pair<Integer, Integer> swappedPair = PairUtil.swap(pair2);
        System.out.println("Modified Pair: " + swappedPair);
    }
}
