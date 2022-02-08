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
    }

    public void employeeInfo(){
        System.out.printf(
                "ID: %s, Name: %s, Department: %s, Age: %d, Gender: %s \n",
                this.id,
                this.name,
                this.department,
                this.age,
                this.gender
        );
    }
}
