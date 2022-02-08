package com.company.day5;

/* Day 5, Task 4 */

public class Book {
    String name, author;
    double price;

    public Book(){
        super();
    }

    public Book(String name, String author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void bookPrice(){
        System.out.printf(
                "Name: %s, Author: %s, Price: %f \n",
                this.name,
                this.author,
                this.price
        );
    }

    public void bookAuthor(){
        System.out.printf(
                "Name: %s, Author: %s \n",
                this.name,
                this.author
        );
    }
}
