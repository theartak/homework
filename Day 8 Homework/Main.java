package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     This method allows the user to input his/her age. The
     method will show if the person is eligible to vote. A person who is
     eligible to vote must be older than or equal to 18 years old.
     */

    public static void Task1() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Eligible to vote");
        } else System.out.println("Not eligible to vote");
    }

    /**
     A method thaat determines whether an input number is an
     even number.
     */

    public static void Task2() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i%2 == 0){
            System.out.println("Number is even");
        } else System.out.println("Number isn't even");
    }

    /**
     A method that generates and prints random numbers ranging from 2 to 7 (without "bound").
     */

    public static void Task3() {
        Random rand = new Random();
        int randomNum = (rand.nextInt()) % 6 + 2;
        System.out.println(randomNum);
    }

    /**
     A method that generates and prints random numbers ranging from 2 to 7 (with "bound").
     */

    public static void Task3Bound() {
        Random rand = new Random();
        int min = 2, max = 7;
        int randomNum = rand.nextInt(max - min + 1) + min;
        System.out.println(randomNum);
    }

    /**
     A method that determines whether an input number is a
     multiple of a 5.
     */

    public static void Task4() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i % 5 == 0){
            System.out.println("i is a multiple of 5");
        } else System.out.println(i + " is not a multiple of 5");
    }

    /**
     A method that takes three numbers from the user and prints the greatest number.
     */

    public static void Task5() {
        Scanner sc = new Scanner(System.in);
        int usr1 = sc.nextInt();
        int usr2 = sc.nextInt();
        int usr3 = sc.nextInt();
        String tgn = " is the greatest number";
        if (usr1 > usr2 && usr1 > usr3){
            System.out.println(usr1 + tgn);
        } else if (usr2 > usr1 && usr2 > usr3){
            System.out.println(usr2 + tgn);
        } else if (usr3 > usr1 && usr3 > usr2){
            System.out.println(usr3 + tgn);
        }
    }

    /**
     A method that reads a floating-point number and prints "zero" if the number is zero.
     Otherwise, prints "positive" or "negative".
     Adds "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
     */

    public static void Task6() {
        Scanner sc = new Scanner(System.in);
        float i = sc.nextFloat();
        if (i == 0.0){
            System.out.print("Zero");
        } else if (i > 0.0){
            System.out.print("Positive");
        } else if (i < 0.0){
            System.out.print("Negative");
        } if (Math.abs(i) > 1000000){
            System.out.print(" large");
        } else if (Math.abs(i) < 1){
            System.out.print(" small");
        }
    }

    /**
     A method that keeps a number from the user and generates
     an integer between 1 and 7 and displays the name of the weekday.
     (Uses 'if').
     */

    public static void Task7() {
        Random rand = new Random();
        int min = 1, max = 7;
        int day = rand.nextInt(max - min + 1) + min;
        if (day == 1){
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3){
            System.out.println("Wednesday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else if (day == 7){
            System.out.println("Sunday");
        }
    }

    /**
     A method that keeps a number from the user and generates
     an integer between 1 and 7 and displays the name of the weekday.
     (Uses 'switch').
     */

    public static void Task7Switch() {
        Random rand = new Random();
        int min = 1, max = 7;
        int day = rand.nextInt(max - min + 1) + min;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday ");
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
     A method that takes a year from the user and prints
     whether that year is a leap year or not.
     */

    public static void Task9() {
        Scanner sc = new Scanner(System.in);
        String leap = "Leap year";
        String notLeap = "Not a leap year";
        int yr = sc.nextInt();
        if (yr % 4 == 0 && yr % 100 != 0){
            System.out.println(leap);
        } else if (yr % 4 == 0 && yr % 100 == 0 && yr % 400 == 0){
            System.out.println(leap);
        } else System.out.println(notLeap);
    }

    /**
     * A method that generates random integer value, prints "true" if the value
     corresponds the given conditions, otherwise prints false.
     - The input number is greater than -1000 and less than 1000.
     - The input number is a multiple of 3, or 5.
     */

    public static void Task8_2() {
        int min = -1000, max = 1000;
        Random rand = new Random();
        int num = rand.nextInt(max - min + 1) + min;
        if (num > -1000 && num < 1000 && num % 3 == 0 || num % 5 == 0){
            System.out.println(true);
        } else System.out.println(false);
        System.out.println(num);
    }

    /**
     A method that inputs int values a and b from the console.
     If one of them is multiple of 7, and both positive, and a
     greater than b, prints all odd values between them,
     otherwise print all even values between them.
     */

    public static void Task10() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
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
     Given coordinates of two points in the coordinate plane.
     The method that inputs 4 coordinates from the console (!= 0),
     checks if the points lie in the same plane,
     prints "In the same quarter", or "Not in the same quarter".
     */

    public static void Task11() {
        Scanner sc = new Scanner(System.in);
        String ans1 = "Coordinates are in the same plane";
        String ans2 = "Coordinates are in different planes";
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && d > 0){
            System.out.println(ans1);
        } else if (a < 0 && b < 0 && c < 0 && d < 0){
            System.out.println(ans1);
        } else System.out.println(ans2);
    }

    /**
     A method that given 3 positive numbers from the console
     determine if there is a non-degenerate triangle with such sides.
     */

    public static void Task12() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("You can form a non-degenerate triangle");
        } else System.out.println("The triangle is degenerate");
    }

    /**
     A method that given 3 numbers from the console
     prints count of numbers that equal to each other.
     (The current instance doesn't recognize when a =/= b, but b = c, will discuss during the lesson).
     */

    public static void Task13() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int count = 0;
        if (a == b){count = count + 2;
            if (a == c){
                count++;
                System.out.println(count);
            } else System.out.println(count);
        } else if (a != b){
            if (a == c){
                count = count + 2;
                System.out.println(count);
            }
        } else if (b == c){count = count + 2;
            if (a == c){
                count++;
                System.out.println(count);
            } else System.out.println(count);
        }
        else if (b != c){
            if (b == a){
                count = count + 2;
                System.out.println(count);
            }
            else if (a == c) {
                count = count + 2;
                if (a == b) {
                    count++;
                    System.out.println(count);
                } else System.out.println(count);
            }   else if (a != c){
                if (b == c){
                    count = count + 2;
                    System.out.println(count);
                }
            }
        } else System.out.println("No equal numbers");
    }

    /**
     A method that prints the decisions for an quadratic equation.
     */

    public static void Task14() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double D = Math.pow(b, 2.0) - (4.0*a*c);
        if (D > 0){
            double x1 = (-b + Math.pow(D, 0.5)) / 2.0 * a;
            double x2 = (-b - Math.pow(D, 0.5)) / 2.0 * a;
            System.out.println("The roots are " + x1 + "and" + x2);
        } else if (D == 0){
            double x = -b / (2.0 * a);
            System.out.println("The root is " + x);
        } else System.out.println("The roots are not real");
    }

    /**
     A method that inputs 3 numbers and sorts them in an ascending order.
     */

    public static void Task15() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > b && a > c){
            if (b > c){
                System.out.println(c + " " + b + " " + a);
            } else System.out.println(b + " " + c + " " + a);
        } else if(b > c){
            if (a > c){
                System.out.println(c + " " + a + " " + b);
            } else System.out.println(a + " " + c + " " + b);
        } else if(a > b){
            System.out.println(b + " " + a + " " + c);
        } else System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
       Task9();
    }
}
