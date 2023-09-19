package com.mylearning.core.generics.practice.box;

/**
 * Создайте класс Box, который имеет параметризованный тип данных.
 * Он должен иметь метод add для добавления элемента в коробку и
 * метод get для получения элемента из коробки.
 * Создайте объект Box с параметром типа String, добавьте в него строку и получите ее.
 */
public class Box<E extends String> {
    private E item;

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<String> element = new Box<>();
        element.setItem("apple");
        String item = element.getItem();
        System.out.println(item);
    }
}
