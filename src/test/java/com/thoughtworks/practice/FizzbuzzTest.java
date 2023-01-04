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
    public void handleFizzBuzz_GivenInputIsDivisibleBy3_Return_fizz() {
        String input = "12";
        String expectedOutput = "fizz";
        assertEquals(expectedOutput, subject.handleFizzBuzz(input));
    }
}
