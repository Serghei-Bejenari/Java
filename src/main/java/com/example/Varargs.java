package com.example;

import java.util.Arrays;
import java.util.Comparator;

public class Varargs {
    void average(int... numbers) {
        final int length = numbers.length;
        final int sum = Arrays.stream(numbers).sum();
        System.out.println(sum / length);
    }

    static void maxStringLength(String... words) {
        System.out.println(Arrays.stream(words).sorted().max(Comparator.comparing(String::length)));
    }


    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        varargs.average(1, 2, 3, 4, 5);
        maxStringLength("hello", "hi", "bye");
    }
}
