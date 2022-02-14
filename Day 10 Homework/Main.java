package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //int k = sc.nextInt();
        //double x = sc.nextDouble();
        //double y = sc.nextDouble();
        int x = sc.nextInt();
        //int p = sc.nextInt();
        //int y = sc.nextInt();
        returnSumOfDigits(x);
    }

    /***
     * Task 1
     * A method that prints all integers from 1 to 10.
     */

    public static void printAllIntegers() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i++);
        }
    }

    /**
     * Task 2
     * A method that prints all even integers between 1 and 20.
     */

    public static void printAllEvenIntegers() {
        int i = 0;
        while (i < 18) {
            i = i + 2;
            System.out.println(i);
        }
    }

    /**
     * Task 3
     * A method that prints all squares that don't exceed the given number input from the console.
     */

    public static void printSquares(int a) {
        int i = 1;
        while ((i * i) < a) {
            System.out.println(i * i);
            ++i;
        }
    }

    /**
     * Task 4
     * A method that prints the smallest divisor of a given integer input from the console.
     */

    public static void smallestDivisor(int a) {
        int i = 2;
        while (i <= a) {
            if (a % i == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    /**
     * Task 5
     * A method that prints all integer powers of 2 below the given number.
     */

    public static void printPowersOf2(int a) {
        int i = 2;
        while (i < a) {
            if (i > 1) {
                System.out.println(i);
                i *= 2;
            }
        }
    }

    /**
     * Task 6
     * A method that prints all the positive integers below the given number in a descending order.
     */

    public static void printDescendingIntegers(int a) {
        int i = a;
        while (i <= a) {
            if (i > 1) {
                System.out.println(--i);
            } else if (i == 1) {
                break;
            }
        }
    }

    /**
     * Task 7
     * A method that prints all the positive multiples of 2 below the given number in a descending order.
     */

    public static void printMultOf2Descending(int a) {
        int i = a;
        while (i <= a) {
            if (i > 2 && i % 2 == 0) {
                System.out.println(i = i - 2);
            } else if (i == 2) {
                break;
            }
        }
    }

    /**
     * Task 8
     * A method that accepts integers until the input is a power of 2,
     * prints the input and the amount of tries.
     * (Uses do-while).
     */

    public static void inputPowerOf2() {
        int count = 0;
        int a;
        do {
            a = sc.nextInt();
            ++count;
        }
        while ((a & (a - 1)) != 0);
        System.out.println(a + " is a power of 2");
        System.out.println(count);
    }

    /**
     * Task 9
     * A method that for a given natural N prints the smallest integer k
     * so that Math.pow(2,k) ≥ N.
     */

    public static void smallestInteger(int k) {
        int n = 0;
        int integer = 1;
        while (true) {
            if (integer >= k) {
                break;
            }
            integer *= 2;
            n++;
        }
        System.out.println(n);
    }

    /**
     * Task 10
     * A method that prints ASCII chars from 32 to 122.
     */

    public static void printASCIIChars() {
        int i = 31;
        while (i < 122) {
            ++i;
            System.out.print((char) i);
            if (i % 10 == 2) {
                System.out.print("\n");
            }
        }
    }

    /**
     * Task 11
     * A method that accepts an integer and prints all the numbers below it except multiples of 3.
     */

    public static void printIntExcMultOf3(int a) {
        int i = a;
        while (i > 0) {
            --i;
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    /**
     * Task 12
     * A method that accepts an integer and defines which number it is in the Fibonacci sequence,
     * or returns -1 in case it isn't a number in the sequence.
     */

    public static int checkFibonacciNumber(int n) {
        int a = 0;
        int b = 1;
        int sum = a + b;
        int index = 1;
        while (sum != n) {
            if (sum > n) {
                return -1;
            }
            sum = a + b;
            a = b;
            b = sum;
            index++;
        }
        return index;
    }

    /**
     * Task 13
     * A method that accepts an x amount of km's a runner passes on the first day
     * and returns the amount of days it will take to reach y km's in a day.
     */

    public static int determineKMIncrease(double x, double y) {
        int days = 1;
        while (x < y) {
            x = x + (x * 0.1);
            days++;
        }
        return days;
    }

    /***
     * Task 14
     * A method that determines in how many years the contribution of a given x dollars
     * will be at least y dollars if it's raised by p percent annually.
     */


    public static int checkDeposit(int x, int p, int y) {
        int years = 0;
        while (x < y) {
            x += x * 0.1;
            years++;
        }
        return years;
    }

    /**
     * Task 17
     * A method that prints the sum of a given integer's digits.
     */

    public static void returnSumOfDigits(int a) {
        int sum = 0;
        while (a != 0) {
            sum = sum + (a % 10);
            a = a / 10;
        }
        System.out.println(sum);
    }

}

