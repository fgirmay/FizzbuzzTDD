package com.thoughtworks.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzbuzzTest {

    private Fizzbuzz subject;

    @BeforeEach
    public void setUp() {
        subject = new Fizzbuzz();
    }

    @Test
    public void handleFizzBuzz_GivenInputIsDivisibleBy_3_Return_fizz() {
        String input = "12";
        String expectedOutput = "fizz";
        assertEquals(expectedOutput, subject.handleFizzBuzz(input));
    }

    @Test
    public void handleFizzBuzz_GivenInputIsDivisibleBy_5_Return_buzz() {
        String input = "10";
        String expectedOutput = "buzz";
        assertEquals(expectedOutput, subject.handleFizzBuzz(input));
    }
}
