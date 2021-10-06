package com.example;

public class Operators {
    static int birthday = 4;
    static int age = 2;

    public static void main(String[] args) {
        //first will count pre increment (age++)
        //next will count age * birthday
        //last will count age + birthday
        System.out.println(age + birthday + age++ + age * birthday);

        System.out.println(age <= birthday && birthday % age != 0);

        System.out.println("maximum number: " + ((age > birthday) ? age : birthday));
    }
}
