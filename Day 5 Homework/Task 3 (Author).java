package com.company.day5;

/* Day 5, Task 3 */

public class Author {
    String name, email, gender;

    Author(String name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
        authorInfo(name, email, gender);
    }

    public static void authorInfo(String name, String email, String gender){
        System.out.println("Name: " + name + ", Email: " + email + ", Gender" + gender);
    }
}
