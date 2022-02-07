package com.company;

import java.util.Scanner;

public class Day3Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        convertFahrenheitToCelsius(input);
    }

    public static void convertFahrenheitToCelsius(double fahrenheit) {
        double celsiusDouble = (fahrenheit - 32) / 1.8;
        System.out.println("celsiusDouble " + celsiusDouble);

        float celsiusFloat = (float) celsiusDouble;
        System.out.println("celsiusFloat " + celsiusFloat);

        int celsiusInt = (int) celsiusFloat;
        System.out.println("celsiusInt " + celsiusInt);
    }
}
