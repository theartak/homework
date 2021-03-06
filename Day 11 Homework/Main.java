package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int a = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();
        //int d = sc.nextInt();
        printCheckerboard(a);
    }

    /**
     * Task 1
     * A method that accepts two integers as a range and prints all even numbers between them.
     */

    public static void printEvenNumbers(int a, int b) {
        if (!(a > b)) {
            for (int i = a; i < b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Incorrect range");
        }
    }

    /**
     * Task 2
     * A method that accepts a range given by the user and prints all the numbers that
     * if divided by a given c the remainder of the division is d.
     */

    public static void printRemainderCByD(int a, int b, int c, int d) {
        if (!(a > b)) {
            if (d != 0) {
                for (int i = a; i < b; i++) {
                    if (i % d == c) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("You can't divide by zero");
            }
        }
    }

    /**
     * Task 3
     * A method that accepts a given 'a to b' range by the user,
     * guarantees that a doesn't exceed b and
     * prints all exact squares between them if there are any.
     */

    public static void printExactSquares(int a, int b) {
        if (!(a > b)) {
            for (int i = a; i < b; i++) {
                if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    /**
     * Task 4
     * A method that accepts two numbers and prints the amount of second's digits in the first one.
     */

    public static void countDigits(int x, int d) {
        int count = 0;
        while (x > 0) {
            count = (x % 10 == d) ?
                    count + 1 : count;
            x = x / 10;
        }
        System.out.println(count);
    }

    /**
     * Task 5
     * A method that reverse the given number.
     */

    public static void reverseNumber(int i) {
        int reverse = 0;
        for (; i != 0; i = i / 10) {
            int remainder = i % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);
    }

    /**
     * Task 6
     * A method that returns the smallest natural divisor of a given number.
     */

    public static int smallestDivisor(int a) {
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                a = i;
            }
        }
        return a;
    }

    /**
     * Task 7
     * A method that prints all the naturals of a given number in an ascending order.
     */

    public static void printAllNaturalDivisors(int a) {
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Task 8
     * A method that prints the count of all natural divisors of a given number.
     */

    public static void allDivisorsOfX(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * Task 9
     * A method that accepts 10 integers from the console and prints their sum.
     */

    public static void countTheSumOf10Numbers() {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            int a = sc.nextInt();
            sum = sum + a;
            count++;
        }
        System.out.println(sum);
    }

    /**
     * Task 10
     * A method that accepts a binary number and converts it to decimal.
     */

    public static void convertBinaryToDecimal(int bin) {
        int dec = 0;
        //int i = 0;
        int remainder;
        for (int i = 0; i < 10; i++) {
            remainder = bin % 10;
            bin /= 10;
            dec += remainder * Math.pow(2, i);
        }
        System.out.println(dec);
    }

    /**
     * Task 10
     * A method that accepts a binary number and converts it to decimal.
     * (Uses while)
     */

    public static void convertBinToDecWhile(int bin) {
        int dec = 0;
        int i = 0;
        int remainder;
        while (bin != 0) {
            remainder = bin % 10;
            bin /= 10;
            dec += remainder * Math.pow(2, i);
            ++i;
        }
    }


    /**
     * Task 11
     * Accepts an 'n' number from the user, accepts an 'n' amount of integers and
     * prints the amount of zeros, positives and negatives among them.
     */

    public static void countZerosAndNumbers() {
        System.out.println("Input the amount of integers: ");
        int n = sc.nextInt();
        int zeros = 0;
        int positives = 0;
        int negatives = 0;
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                zeros++;
            } else if (num > 0) {
                positives++;
            } else {
                negatives++;
            }
        }
        System.out.println("Zeros: " + zeros);
        System.out.println("Positives: " + positives);
        System.out.println("Negatives: " + negatives);
    }

    /**
     * Task 12
     * Accepts a number from the user and prints the firs given amount of numbers
     * of a GNCHE-1 sequence.
     */

    public static void gnche(int a) {
        int sum = 0;
        for (int i = 1; ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                sum++;
                if (sum == a) {
                    return;
                }
            }
        }
    }

    /**
     * Task 13
     * A method that accepts a number from the user and prints a N*N size picture.
     */

    public static void printNNPicture(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Task 14
     * A method N*N sized checkerboard.
     */

    public static void printCheckerboard(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i % 2 != 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
