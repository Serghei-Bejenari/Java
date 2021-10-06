package com.example;

public class Cat implements Eating {    //implementing interface
    int age = 1;
    boolean isMammal = true;
    String name = "Barsik";
    char ch = 'c';

    public Cat(int age, boolean isMammal, String name, char ch) {
        this.age = age;
        this.isMammal = isMammal;
        this.name = name;
        this.ch = ch;
    }

    public Cat(int age, boolean isMammal, String name) {
        this.age = age;
        this.isMammal = isMammal;
        this.name = name;
    }

    public Cat(int age, boolean isMammal) {
        this.age = age;
        this.isMammal = isMammal;
    }

    public Cat(int age) {
        this.age = age;
    }

    //constructor without parameters
    public Cat() {
    }

    //overriding the interface method
    @Override
    public void eat() {
        System.out.println("Hrum, Hrum");
    }

    //nested class
    static class NestedClass {
        void test() {
        }
    }

    //static nested class
    static class StaticNestedClass {
    }

    interface Interface {
        void voice();
    }

    public static void main(String[] args) {

        //anonymous class
        Interface anInterface = new Interface() {
            @Override
            public void voice() {
                System.out.println("Mey");
            }
        };
        Cat cat = new Cat(2, true, "Barsik");
        cat.eat();
        anInterface.voice();
    }
}
