package com.thoughtworks.practice;

public class Fizzbuzz {
    public String handleFizzBuzz(String input) {
        String output = "";
        try {
            if (Integer.parseInt(input) % 3 == 0) {
                output += "fizz";
            }

            if (Integer.parseInt(input) % 5 == 0) {
                output += "buzz";
            }

        } catch (NumberFormatException nfx) {
            System.out.println("Input is not a number");
        }
        return output;
    }
}
