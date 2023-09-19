package com.mylearning.core.generics.practice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создайте параметризованный интерфейс Comparator, который сравнивает два объекта типа T.
 * Он должен иметь метод compare, который возвращает значение, указывающее, какой объект меньше,
 * равен или больше другого объекта. Создайте класс Person, который имеет поля name и age.
 * Создайте объект Comparator для сравнения объектов Person по возрасту и отсортируйте
 * список объектов Person с помощью этого компаратора.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        MyComparator<Person> nameComparator = new MyComparator<>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };

        MyComparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        Person ivan = new Person("Ivan", 23);
        Person nikita = new Person("Nikita", 12);
        Person egor = new Person("Egor", 8);
        Person vasiliy = new Person("Vasiliy", 14);
        List<Person> personList = new ArrayList<>();
        personList.add(ivan);
        personList.add(nikita);
        personList.add(egor);
        personList.add(vasiliy);
        System.out.println(personList);
        Collections.sort(personList, ageComparator::compare);
        System.out.println(personList);
    }
}
