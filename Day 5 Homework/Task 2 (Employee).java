package com.company.day5;

/* Day 5, Task 2 */

public class Employee {
    long id;
    String name;
    String department;
    int salary;
    int age;
    char gender;

    Employee(){
        this(10000000L, "Unspecified", "Unspecified", 500, 18, 'U' );
    }

    Employee(long id, String name, String department, int salary, int age, char gender){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public void employeeInfo(){
        System.out.printf(
                "ID: %d, Name: %s, Department: %s, Salary: %d, Age: %d, Gender: %s \n",
                this.id,
                this.name,
                this.department,
                this.salary,
                this.age,
                this.gender
        );
    }
}
