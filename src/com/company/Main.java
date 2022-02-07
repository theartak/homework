package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte input = sc.nextByte();
        wideningCasting1(input);
        wideningCasting2(input);
        wideningCasting3(input);
        wideningCasting4(input);
        wideningCasting5(input);
    }

    public static void wideningCasting1(byte b) {
        short a = b;
        System.out.println("byte: " + b + ", short: " + a);
    }

    public static void wideningCasting2(short b) {
        int a = b;
        System.out.println("short: " + b + ", int: " + a);
    }

    public static void wideningCasting3(int b) {
        long a = b;
        System.out.println("int: " + b + ", long: " + a);
    }

    public static void wideningCasting4(long b) {
        float a = b;
        System.out.println("long: " + b + ", float: " + a);
    }

    public static void wideningCasting5(float b) {
        double a = b;
        System.out.println("float: " + b + ", double: " + a);
    }
}
