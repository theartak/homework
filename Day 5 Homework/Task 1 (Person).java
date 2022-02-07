package com.company.day5;

/* Day 5, Task 1 */

public class Person {
    String name;
    int age;
    String address;

    public Person(){}

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        personInfo(name, age, address);
    }

    public static void personInfo(String name, int age, String address){
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}