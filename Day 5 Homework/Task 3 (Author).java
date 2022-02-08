package com.company.day5;

/* Day 5, Task 3 */

public class Author {
    String name, email;
    char gender;

    Author(){
        super();
    }

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void authorInfo(){
        System.out.printf(
                "Name: %s, Email: %s, Gender: %s \n",
                this.name,
                this.email,
                this.gender
        );
    }
}
