package com.company.day5;

/* Day 5, Task 4 */

public class Book {
    String name, author;
    double price;

    public Book(String name, String author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
        bookPrice(name, author, price);
        bookAuthor(name, author);
    }

    public static void bookPrice(String name, String author, double price){
        System.out.println("Name: " + "'" + name + "'" + ", Author: " + author + ", Price: " + price);
    }

    public static void bookAuthor(String name, String author){
        System.out.println("Name: " + "'" + name + "'" + ", Author: " + author);
    }
}
