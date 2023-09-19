package com.mylearning.core.generics.practice.matrix;

/**
 * Создайте параметризованный класс Matrix, который хранит матрицу элементов типа T.
 * Он должен иметь методы get и set для получения и установки значения элемента матрицы по индексу.
 * Создайте объект Matrix с параметрами типа Double, установите значения элементов и получите их.
 */
public class Matrix<T> {
    private Object[][] matrix;

    public Matrix(int row, int column) {
        this.matrix = new Object[row][column];
    }

    @SuppressWarnings("unchecked")
    public T get(int row, int column) {
        if (row < 0 || row >= matrix.length && column < 0 || column >= matrix[0].length) {
            throw new IndexOutOfBoundsException();
        }
        return (T) matrix[row][column];
    }

    public void set(int row, int column, T value) {
        if (row < 0 || row >= matrix.length || column < 0 || column >= matrix[0].length) {
            throw new IndexOutOfBoundsException("Индексы находятся вне диапазона");
        }
        matrix[row][column] = value;
    }

    public static void main(String[] args) {
        Matrix<Double> matrix = new Matrix<>(3, 3);
        matrix.set(0, 0, 1.0);
        matrix.set(0, 1, 2.0);
        matrix.set(0, 2, 3.0);
        matrix.set(1, 0, 4.0);
        matrix.set(1, 1, 5.0);
        matrix.set(1, 2, 6.0);
        matrix.set(2, 0, 7.0);
        matrix.set(2, 1, 8.0);
        matrix.set(2, 2, 9.0);

        double element00 = matrix.get(0, 0);
        double element11 = matrix.get(1, 1);
        double element22 = matrix.get(2, 2);

        System.out.println("Элемент (0, 0): " + element00);
        System.out.println("Элемент (1, 1): " + element11);
        System.out.println("Элемент (2, 2): " + element22);
    }
}
