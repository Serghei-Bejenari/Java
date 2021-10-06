package com.example;

public class Loops {
    static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
    static String[] strings = new String[]{"one", "two", "three", "four", "five"};

    static int loop(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 4) {
                num = i;
                System.out.println(i);
            } else if (i == 5) {
                num = i;
                System.out.println(i);
            } else if (i == 6) {
                num = i;
                System.out.println(i);
                break;
            } else if (i == 7) {
                num = i;
                System.out.println(i);
            } else {
                num = 0;
                System.out.println("This text will be write in case if value from array did not match any if statement");
            }
        }
        System.out.println(num);
        return num;
    }

    static void switchCase(String[] strings) {
        for (String str : strings) {
            switch (str) {
                case "two":
                    System.out.println(str);
                    break;
                case "three":
                    System.out.println(str);
                    break;
                case "five":
                    System.out.println(str);
                    break;
                default:
                    System.out.println("This text will be write in case if value from array did not match any if statement " + str);
            }

        }
    }

    public static void main(String[] args) {
        loop(array);
        switchCase(strings);
    }
}
