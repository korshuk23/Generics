package com.mylearning.core.generics.practice.stack;

import java.util.Arrays;

/**
 * Создайте параметризованный класс Stack, который имеет тип элементов T.
 * Он должен иметь методы push, pop и isEmpty. Создайте объект Stack с параметром типа String,
 * добавьте в него несколько элементов, извлеките их и выведите на экран.
 */
public class MyStack<T> {
    private Object[] stack;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;


    public MyStack() {
        this.stack = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void push(T item) {
        resizeStack();
        stack[size++] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty stack");
        }
        T removedEl = (T) stack[size - 1];
        stack[size - 1] = null;
        size--;
        return removedEl;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resizeStack() {
        if (this.size == stack.length) {
            int newCapacity = stack.length * 2;
            stack = Arrays.copyOf(stack, newCapacity);
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(stack[i]).append(", ");
        }
        sb.append(stack[size - 1]).append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        System.out.println(stack.isEmpty());
        stack.push("a");
        System.out.println(stack.isEmpty());
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
