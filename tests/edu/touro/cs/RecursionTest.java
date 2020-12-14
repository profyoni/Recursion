package edu.touro.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void factorial() {
        int actual = Recursion.factorial(995);

        assertEquals(120, actual);
    }
    @Test
    void fib() {
        int actual = Recursion.fib(50);

        assertEquals(55, actual);
    }

    @Test
    void isPalindrome2() {
    }
}