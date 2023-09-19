package com.mylearning.core.generics.practice.sorter;

import java.util.Arrays;

/**
 * Создайте параметризованный класс Sorter<T extends Comparable<T>>, который имеет метод sort,
 * принимающий на вход массив элементов типа T и сортирующий его в порядке возрастания.
 * Создайте массив элементов типа Integer, отсортируйте его с помощью метода sort и выведите
 * отсортированный массив на экран.
 */
public class Sorter<T extends Comparable<T>> {
    public void sort(T[] items) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < items.length - 1; i++) {
                if (items[i].compareTo(items[i + 1]) > 0) {
                    swap(items, i, i + 1);
                    isSorted = false;
                }
            }
        }
    }

    private void swap(T[] items, int i, int j) {
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] integers = {8, 4, 9, 1};
        Sorter<Integer> sorter = new Sorter<>();
        sorter.sort(integers);
        System.out.println(Arrays.toString(integers));
    }
}
