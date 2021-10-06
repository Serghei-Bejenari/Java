package com.example;

public class Exceptions {

    static void getException() {
        throw new NullPointerException("Null Pointer Exception");
    }

    //    this method throws and exception (NullPointerException)
    static void throwsExceptions() throws NullPointerException {
        getException();
    }

    //    In our code we can handle errors
    static void catchException() {

        //    The try statement allows you to define a block of code to be tested for errors while it is being executed
        try {
            throwsExceptions();

            //    The catch statement allows you to define a block of code to be executed, if an error occurs in the try block
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

            //    The finally statement lets you execute code, after try...catch, regardless of the result
        } finally {
            System.out.println("This block will run in any case");
        }
    }

    public static void main(String[] args) {
        catchException();
    }
}
