package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        System.out.println(Task3Bound());
    }

    /**
     * Task 1
     * This method allows the user to input his/her age. The
     * method will show if the person is eligible to vote. A person who is
     * eligible to vote must be older than or equal to 18 years old.
     */

    public static void isEligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    /**
     * Task 2
     * A method that determines whether an input number is an
     * even number.
     */

    public static boolean isEven(int num) {
        return ((num & 1) == 0);
    }

    /**
     * Task 3
     * A method that generates and prints random numbers ranging from 2 to 7.
     */

    public static int generateNumberFrom2To7() {
        int randomNum = (int) (Math.random() * 6) + 2;
        return randomNum;
    }

    /**
     * Task 3 (with "bound")
     * A method that generates and prints random numbers ranging from 2 to 7.
     */

    public static int Task3Bound() {
        Random rand = new Random();
        int randomNum = rand.nextInt(6) + 2;
        return randomNum;
    }

    /**
     * Task 4
     * A method that determines whether an input number is a
     * multiple of a 5.
     */

    public static boolean isMultipleOf5(int num) {
        return (num % 5 == 0);
    }

    /**
     * Task 5
     * A method that takes three numbers from the user and prints the greatest number.
     */

    public static int getGreatestNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    /**
     * Task 6
     * A method that reads a floating-point number and prints "zero" if the number is zero.
     * Otherwise, prints "positive" or "negative".
     * Adds "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
     */

    public static void checkNumber(float num) {
        String res = "";
        if (num > 0) {
            res += "positive";
        } else if (num < 0) {
            res += "negative";
        } else {
            res += "zero";
        }
        float absNum = Math.abs(num);
        if (absNum < 1) {
            res += " small";
        } else if (absNum > 1000000) {
            res += " large";
        }
        System.out.println(res);
    }

    /**
     * Task 7 (if)
     * A method that keeps a number from the user and generates
     * an integer between 1 and 7 and displays the name of the weekday.
     * (Uses 'if').
     */

    public static void getWeekDayIf() {
        Random rand = new Random();
        int day = rand.nextInt(7) + 1;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }
    }

    /**
     * Task 7 (switch)
     * A method that keeps a number from the user and generates
     * an integer between 1 and 7 and displays the name of the weekday.
     * (Uses 'switch').
     */

    public static void getWeekDaySwitch() {
        Random rand = new Random();
        int day = rand.nextInt(7) + 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    /**
     * Task 7 (particular case)
     * The ice cream parlor sells three balls and five balls. Can you buy
     * exactly k balls of ice cream?
     * In the cafe they sell an ice-cream with 3 balls and 5 balls. Input k integer
     * value from console, check if you can buy exactly k balls ice-cream.
     * (Strictly for the given case).
     */

    public static boolean canBuyAmountOfBalls(int k) {
        return !(k < 3 || k == 4 || k == 7);
    }

    /**
     * Task 8 (general program)
     * The ice cream parlor sells three balls and five balls. Can you buy
     * exactly k balls of ice cream?
     * In the cafe they sell an ice-cream with 3 balls and 5 balls. Input k integer
     * value from console, check if you can buy exactly k balls ice-cream.
     * (A general program that can check any given case).
     */

    public static void canBuyAmountOfBallsGeneral() {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = 3;
        int b = 5;
        boolean res = false;
        if (k <= 0) {
            System.out.println("You can't order ice cream");
        } else if (k % a == 0 || k % b == 0) {
            res = true;
        } else {
            while (k >= a) {
                if ((k - b) % a == 0) {
                    res = true;
                    break;
                } else {
                    res = false;
                    k = k - b;
                }
            }
            if (!res) {
                while (k >= b) {
                    if ((k - a) % b == 0) {
                        res = true;
                        break;
                    } else {
                        res = false;
                        k = k - a;
                    }
                }
            }
        }
        if (res) {
            System.out.println("You can order ice cream");
        } else System.out.println("You can't order ice cream");
    }

    /**
     * Task 9
     * A method that takes a year from the user and prints
     * whether that year is a leap year or not.
     */

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) ||
                (year % 400 == 0);
    }

    /**
     * Task 8.2
     * A method that generates random integer value, prints "true" if the value
     * corresponds the given conditions, otherwise prints false.
     * - The input number is greater than -1000 and less than 1000.
     * - The input number is a multiple of 3, or 5.
     */

    public static void randomInteger() {
        int min = -1000, max = 1000;
        Random rand = new Random();
        int num = rand.nextInt(max - min + 1) + min;
        if (num > -1000 && num < 1000 && num % 3 == 0 || num % 5 == 0) {
            System.out.println(true);
        } else System.out.println(false);
        System.out.println(num);
    }

    /**
     * Task 10
     * A method that inputs int values a and b from the console.
     * If one of them is multiple of 7, and both positive, and a
     * greater than b, prints all odd values between them,
     * otherwise print all even values between them.
     */

    public static void giveValuesBetween(int a, int b) {
        if (a % 7 == 0 || b % 7 == 0 && a > 0 && b > 0 && a > b) {
            for (int i = b + 1; i < a; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        } else if (a > b) {
            for (int i = b + 1; i < a; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }
            }

        } else if (b > a) {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }
            }
        }
    }

    /**
     * Task 11
     * Given coordinates of two points in the coordinate plane.
     * The method that inputs 4 coordinates from the console (!= 0),
     * checks if the points lie in the same plane,
     * prints "In the same quarter", or "Not in the same quarter".
     */

    public static boolean inSameQuarter(int x1, int y1,
                                        int x2, int y2) {
        return ((x1 > 0 == x2 > 0) &&
                (y1 > 0 == y2 > 0));
    }

    /**
     * Task 12
     * A method that given 3 positive numbers from the console
     * determine if there is a non-degenerate triangle with such sides.
     */

    public static void isTriangleNonDegenerate(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("You can form a non-degenerate triangle");
        } else {
            System.out.println("The triangle is degenerate");
        }
    }

    /**
     * Task 13
     * A method that given 3 numbers from the console
     * prints count of numbers that equal to each other.
     * (The current instance doesn't recognize when a =/= b, but b = c, will discuss during the lesson).
     */

    public static int equalNumbersCount(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        }
        if (a == b || b == c || a == c) {
            return 2;
        }
        return 0;
    }

    /**
     * Task 14
     * A method that prints the decisions for an quadratic equation.
     */

    public static void quadEquationRoots(double a, double b, double c) {
        double D = Math.pow(b, 2.0) - (4.0 * a * c);
        if (D > 0) {
            double x1 = (-b + Math.pow(D, 0.5)) / (2.0 * a);
            double x2 = (-b - Math.pow(D, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + x1 + "and" + x2);
        } else if (D == 0) {
            double x = -b / (2.0 * a);
            System.out.println("The root is " + x);
        } else {
            System.out.println("The roots are not real");
        }
    }

    /**
     * Task 15
     * A method that inputs 3 numbers and sorts them in an ascending order.
     */

    public static void arrangeNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(c + " " + b + " " + a);
            } else System.out.println(b + " " + c + " " + a);
        } else if (b > c) {
            if (a > c) {
                System.out.println(c + " " + a + " " + b);
            } else System.out.println(a + " " + c + " " + b);
        } else if (a > b) {
            System.out.println(b + " " + a + " " + c);
        } else System.out.println(a + " " + b + " " + c);
    }
}
