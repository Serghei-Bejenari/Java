package com.example;

public class Variables {
    public int number = 1;              //this variable visible in whole project
    protected long key = 242;           //this variable visible only in classes on this package and classes which extends this class
    private byte age = 33;          //this variable visible only in this class
    float f = 3.5f;                 //this variable package-private and visible in all classes which in this package
    static short id = 3;            //this variable cold be used without creation an object of class Variables just Variables.s
    final double range = 1.0;       //this value of this variable on other place of program cannot be changed
    static final boolean isSorted = true;
    char ch = 'c';

    public static void main(String[] args) {
//      Variables.bol = false;          //error because variable is final
        Variables.id = 2;
    }
}