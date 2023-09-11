package com.mylearning.core.generics.game;

public class test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Ivan", 13);

        Student student1 = new Student("Nilolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Andrei", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Schoolars");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        //schoolarTeam.addNewParticipant(employee1);

        Team<Student> studentTeam = new Team<>("Students");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Employees");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        //Team<String> stringTeam = new Team<>("String");

        Team<Schoolar> schoolarTeam2 = new Team<>("Schoolars2");
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Ivan", 14);
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
