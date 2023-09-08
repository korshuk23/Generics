package com.mylearning.core.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(100, "Andrey", "Korshuk", 12345));
        list.add(new Employee(14, "Ivan", "Petrik", 3245));
        list.add(new Employee(42, "Ivan", "Ivanov", 4532));
        list.add(new Employee(123, "Nikolay", "Sidorov", 5323));
        System.out.println("Before sorting: ");
        System.out.println(list);
        System.out.println("After sorting: ");
        Collections.sort(list, new SalaryComparator());
        System.out.println(list);
    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1.id == employee2.id) {
            return 0;
        } else if (employee1.id < employee2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.name.compareTo(employee2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.salary - employee2.salary;
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        int res = this.name.compareTo(employee.name);
        if (res == 0) {
            res = this.surname.compareTo(employee.surname);
        }
        return res;
    }
}
