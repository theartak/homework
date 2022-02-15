package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        //int k = sc.nextInt();
        //double x = sc.nextDouble();
        //double y = sc.nextDouble();
        //int x = sc.nextInt();
        //int p = sc.nextInt();
        //int y = sc.nextInt();
        guessTheNumber();
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
        while (i * i <= a) {
            System.out.println(i * i);
            i++;
        }
    }

    /**
     * Task 4
     * A method that prints the smallest divisor of a given integer input from the console.
     */

    public static int smallestDivisor(int a) {
        int i = 2;
        while (i <= a) {
            if (a % i == 0) {
                return i;
            }
            i++;
        }
        return a;
    }

    /**
     * Task 5
     * A method that prints all integer powers of 2 below the given number.
     */

    public static void printPowersOf2(int a) {
        int i = 1;
        while (i < a) {
            System.out.println(i);
            i *= 2;
        }
    }

    /**
     * Task 6
     * A method that prints all the positive integers below the given number in a descending order.
     */

    public static void printDescendingIntegers(int a) {
        int i = a - 1;
        while (i > 0) {
            System.out.println(i--);
        }
    }

    /**
     * Task 7
     * A method that prints all the positive multiples of 2 below the given number in a descending order.
     */

    public static void printMultOf2Descending(int a) {
        int i = a;
        if (i % 2 != 0) {
            i -= 1;
        }
        while (i >= 2) {
            System.out.println(i);
            i -= 2;
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

    public static int smallestInteger(int k) {
        int n = 0;
        int integer = 1;
        while (true) {
            if (integer >= k) {
                break;
            }
            integer *= 2;
            n++;
        }
        return k;
    }

    /**
     * Task 10
     * A method that prints ASCII chars from 32 to 122.
     */

    public static void printASCIIChars() {
        int i = 32;
        while (i < 122) {
            i++;
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
        int i = 1;
        while (i < a) {
            i++;
            if (i % 3 == 0) {
                continue;
            } else if (i == a) {
                break;
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
            x += x * p / 100;
            years++;
        }
        return years;
    }

    /**
     * Task 15
     * A sequence consists of different natural numbers and ends with the number 0.
     * This is a method that determines the second largest element in the sequence.
     */

    public static void secondLargestInt() {
        int max = Integer.MIN_VALUE;
        int min = 0;
        int num;
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                min = max;
                max = num;
            } else if (num > min && num != max) {
                min = num;
            }
        }
        System.out.println(min);
    }

    /**
     * Task 15
     * A sequence consists of different natural numbers and ends with the number 0.
     * This is a method that determines the second largest element in the sequence.
     * (Do-while)
     */

    public static void secondLargestIntDoWhile() {
        int max = Integer.MIN_VALUE;
        int min = 0;
        int num;
        do {
            num = sc.nextInt();
            if (num > max) {
                min = max;
                max = num;
            } else if (num > min && num != max) {
                min = num;
            }
        } while (num != 0);
        System.out.println(min);
    }

//

    /**
     * Task 16
     * A method that generates a random number, lets the user input their number and tells
     * if the input is higher than the random number, or lower, and congratulates the user
     * if they guessed it correctly.
     */

    public static void guessTheNumber() {
        int random = rand.nextInt(10) + 1;
        System.out.println(random);
        int a = sc.nextInt();
        while (true) {
            if (a > random) {
                System.out.println("Your number is higher than " + random + ", try again");
                break;
            } else if (a < random) {
                System.out.println("Your number is lower than " + random + ", try again");
                break;
            } else System.out.println("You guessed the number, congratulations!");
            break;
        }
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

