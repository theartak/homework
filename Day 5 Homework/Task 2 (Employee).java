package com.company.day5;

/* Day 5, Task 2 */

public class Employee {
    String id;
    String name;
    String department;
    int age;
    char gender;

    Employee(String id, String name, String department, int age, char gender){
        this.id = name;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
        employeeInfo(id, name, department, age, gender);
    }

    public static void employeeInfo(String id, String name, String department, int age, char gender){
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Age: " + age + ", Gender: " + gender);
    }
}
