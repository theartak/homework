package com.company;
import java.util.Scanner;

public class Day9Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter an operator");
        char op = sc.next().charAt(0);
        calculator(num1, num2, op);
    }

    /**
     * A simple calculator that accepts two numbers and returns addition, subtraction,
     * multiplication, or division chosen by the user.
     * */

    public static void calculator(int a, int b, char c){
        switch (c){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Please use a valid operator");
        }
    }
}
