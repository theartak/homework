package com.company.day5;

/* Day 5, Task 1 */

public class Person {
    String name;
    int age;
    String address;

    public Person(){
        super();
    }

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void personInfo(){
        System.out.printf(
                "Name: %s, Age: %d, Address: %s \n",
                this.name,
                this.age,
                this.address
        );
    }
}