package com.company;

import java.util.Scanner;

public class Day9Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.print("a. int 1x = 10 \n" +
                "b. int x = 10 \n " +
                "c. float f = 10.0f \n " +
                "d. string x = 10 \n");
        System.out.println("Enter your choice: ");
        char a = sc.next().charAt(0);
        chooseOneAnswer(a);
    }

    public static void chooseOneAnswer(char a) {
        String answ = "Invalid choice, try again";
        String ansr = "Correct choice, congratulations!";
        String answer = "Select a valid option";
        switch (a) {
            case 'a':
                System.out.println(answ);
                break;
            case 'b':
                System.out.println(ansr);
                break;
            case 'c':
                System.out.println(answ);
                break;
            case 'd':
                System.out.println(answ);
                break;
            default:
                System.out.println(answer);
                break;
        }
    }
}
