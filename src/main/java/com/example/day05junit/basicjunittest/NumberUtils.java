package com.example.day05junit.basicjunittest;

public class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        NumberUtils utils = new NumberUtils();
        System.out.println("Is 4 even? " + utils.isEven(4));
        System.out.println("Is 7 even? " + utils.isEven(7));
    }
}

