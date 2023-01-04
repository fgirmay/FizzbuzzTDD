package com.thoughtworks.practice;

public class Fizzbuzz {
    public String handleFizzBuzz(String input) {
        String output = null;
        try {
            if (Integer.parseInt(input) % 3 == 0) {
                output = "fizz";
            }
        } catch (NumberFormatException nfx) {
            System.out.println("Input is not a number");
        }
        return output;
    }
}
