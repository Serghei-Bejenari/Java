package com.example;

public class Threads extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number : " + i);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Threads threadOne = new Threads();
        Threads threadTwo = new Threads();
        threadOne.start();
        threadTwo.start();

        Thread threadThree = new Threads();
        Thread threadFour = new Threads();
        threadThree.start();
        threadFour.start();
    }
}

class Print implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number :" + i);
        }
    }
}
