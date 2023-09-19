package com.mylearning.core.generics.practice.calculator;

/**
 * Создайте параметризованный класс Calculator<T extends Number>, который имеет методы
 * add, subtract, multiply и divide, принимающие на вход два элемента типа T и выполняющие
 * соответствующие операции. Создайте объект Calculator с параметром типа Double, вызовите
 * все его методы, передавая им соответствующие аргументы.
 */
public class Calculator<T extends Number> {
    double result;

    public T add(T item1, T item2) {
        result = item1.doubleValue() + item2.doubleValue();
        return convertResult(item1);
    }

    public T substruct(T item1, T item2) {
        result = item1.doubleValue() - item2.doubleValue();
        return convertResult(item1);
    }

    public T multiply(T item1, T item2) {
        result = item1.doubleValue() * item2.doubleValue();
        return convertResult(item1);
    }

    public T divide(T item1, T item2) {
        if (item2.doubleValue() == 0.0) {
            throw new ArithmeticException("Divide by zero");
        }
        result = item1.doubleValue() / item2.doubleValue();
        return convertResult(item1);
    }

    @SuppressWarnings("unchecked")
    private T convertResult(T item) {
        if (item instanceof Integer) {
            return (T) Integer.valueOf((int) result);
        } else if (item instanceof Double) {
            return (T) Double.valueOf(result);
        } else if (item instanceof Float) {
            return (T) Float.valueOf((float) result);
        } else if (item instanceof Long) {
            return (T) Long.valueOf((long) result);
        } else throw new IllegalArgumentException();
    }
}
