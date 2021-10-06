package com.example;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        scanner.hasNextInt();
        num = scanner.nextInt();

        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        scanner.hasNext();
        operation = scanner.next().charAt(0);
        return operation;
    }

    public static int calc(int numberOne, int numberTwo, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                result = numberOne / numberTwo;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        int numberOne = getInt();
        int numberTwo = getInt();
        char operation = getOperation();
        int result = calc(numberOne, numberTwo, operation);
        System.out.println("Результат операции: " + result);
    }
}