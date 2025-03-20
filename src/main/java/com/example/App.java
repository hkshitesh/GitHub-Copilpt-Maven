package com.example;

public class App {   

    public static void main(String[] args) {
        System.out.println("Hello, GitHub Actions!");

        int a = 5;
        int b = 3;

        int sumResult = sum(a, b);
        int diffResult = diff(a, b);

        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + diffResult);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }
}