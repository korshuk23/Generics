package com.mylearning.core.generics.practice.max;

/**
 * Создайте параметризованный класс Max, который принимает массив элементов типа T
 * и имеет статический метод max, который возвращает наибольший элемент в массиве.
 * Создайте массив элементов типа Double и найдите наибольший элемент в нем с помощью метода max.
 */
public class Max<T extends Comparable<T>> {
    private T[] items;

    public Max(T[] items) {
        this.items = items;
    }

    public T max() {
        if (items == null || items.length == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        T maxElement = items[0];
        for (int i = 1; i < items.length; i++) {
            if (maxElement.compareTo(items[i]) < 0) {
                maxElement = items[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        Max<Double> arr = new Max<>(new Double[]{1.2, 2.1, 6.2, 9.3, 5.3, 4.8});
        System.out.println(arr.max());
    }
}
