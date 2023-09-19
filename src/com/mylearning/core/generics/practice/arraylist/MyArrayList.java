package com.mylearning.core.generics.practice.arraylist;

/**
 * Создайте параметризованный класс ArrayList, который хранит список элементов типа T.
 * Он должен иметь методы add, get, remove и size. Создайте объект ArrayList с параметром типа Integer,
 * добавьте в него несколько элементов и получите их.
 */
public class MyArrayList<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(T item) {
        array[size++] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    public int size() {
        return size;
    }

    private void resizeArray() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            stringBuilder.append(array[i]).append(", ");
        }
        stringBuilder.append(array[size - 1]).append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println("Before remove: " + list);
        System.out.println("Array size: " + list.size());
        list.remove(1);
        System.out.println("After remove: " + list);
        System.out.println("Last item " + list.get(1));
        System.out.println("Array size: " + list.size());
    }
}
