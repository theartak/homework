package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str1 = sc.next();
        //String str2 = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //char z = sc.next().charAt(0);
        //String str = null;
        System.out.println(checkMax(a, b, c));
    }

    /**
     * A method with 2 Strings initialized from the console that:
     * a) Compares them with == assignment
     * b) Compares them with "equals to"
     */

    public static void compareStrings(String str1, String str2) {
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    /**
     * A method with 2 Strings - one initialized with literal, the other with a new keyword.
     * The method compares them with "==" and "equals to" assignments.
     */

    public static void compareDifferentStrings(String str1, String str2) {
        str1 = "";
        str2 = new String("");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    /**
     * A method that inputs an integer from the console
     * and prints "positive" if the value is greater than 0,
     * "negative" if the value is smaller than 0,
     * "zero" if the value is 0.
     */

    public static String isNumPos(int i) {
        String res = (i > 0) ? "Positive" : (i < 0) ? "Negative" : "Zero";
        return res;
    }

    /**
     * A method that achieves Math.max(a,b) with ternary operator.
     */

    public static int getMax(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }

    /**
     * A method that achieves Math.abs(a) with ternary operator.
     */

    public static int getAbs(int a) {
        int abs = (a >= 0) ? a : -a;
        return abs;
    }

    /**
     * A method that checks the String with ternary operator.
     */

    public static int checkString(String str) {
        int res = str == null ? -1 : str.equals("") ? 0 : 1;
        return res;
    }

    /**
     * A method that checks 3 given integers with ternary operator
     * and returns the greatest of them.
     */

    public static int checkMax(int a, int b, int c) {
        int max = ((a >= b) && (a >= c)) ? a : ((b >= a) && (b >= c)) ? b : c;
        return max;
    }

    /**
     * A method that that checks if an input letter is a vowel, or a consonant.
     */

    public static void isVowel(char c) {
        switch (c){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(c + " is a vowel");
                break;
            case 'y':
            case 'Y':
                System.out.println(c + " is sometimes a vowel");
                break;
            default:
                System.out.println(c + " is not a vowel");
                break;
        }
    }

    /**
     * A method that accepts numbers from 0 to 9 and prints them,
     * or prints "not allowed" in case of an invalid input.
     */

    public static void input0To9(int a) {
        switch (a) {
            case 9:
            case 8:
            case 7:
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println(a);
                break;
            default:
                System.out.println("Not allowed");
        }
    }

    /**
     * A method that checks if a number is even, or odd using switch statements.
     */

    public static void isEvenOrOdd(int a) {
        switch (a % 2) {
            case 0:
                System.out.println(a + " is even");
                break;
            case 1:
                System.out.println(a + " is odd");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    /**
     * A method that accepts a week day (starting with uppercase)
     * and returns its corresponding number.
     */

    public static void weekdayNumber(String day) {
        switch (day) {
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("No such day in a week");
                break;
        }
    }

    /**
     * A method that takes quiz, midterm and final scores
     * and gives a final grade based on the average score.
     */

    public static void determineScore(int quiz, int midterm, int finals) {
        int avgScore = Math.floorDiv((quiz + midterm + finals), 3);
        switch (Math.floorDiv(avgScore, 10)) {
            case 10:
                System.out.println("Your grade is A+");
                break;
            case 9:
            case 8:
                System.out.println("Your grade is A");
                break;
            case 7:
            case 6:
                System.out.println("Your grade is B");
                break;
            case 5:
            case 4:
                System.out.println("Your grade is C");
                break;
            default:
                System.out.println("Your grade is F");
                break;
        }
    }

    /**
     * A method that accepts a number and returns "true" if the number
     * is a power of 2, else returns "false".
     */

    public static boolean isPowOf2(int i) {
        if (i == 0)
            return false;
        while (i != 1) {
            if (i % 2 != 0)
                return false;
            i = i / 2;
        }
        return true;
    }
}
