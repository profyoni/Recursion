package edu.touro.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void factorial() {
        int actual = Recursion.factorial(155);

        assertEquals(120, actual);
    }

    @Test
    void fib() {
        long actual = Recursion.fib(50);

        assertEquals(55, actual);
    }

    @Test
    void isPalindrome2() {
        String s = "abba";
        //Arrange, Act, Assert
        boolean actual = Recursion.isPalindrome2(s);

        assertEquals(true, actual);
    }


    @Test
    void isPalindrome2_many() {
        assertTrue(Recursion.isPalindrome2("abba"));
        assertTrue(Recursion.isPalindrome2("racecar"));
        assertTrue( Recursion.isPalindrome2("q"));

        assertTrue(! Recursion.isPalindrome2("qwerty"));
        assertTrue(! Recursion.isPalindrome2("asdwsa"));
    }
    @Test
    void isPalindrome3_many() {
        assertTrue(Recursion.isPalindrome3("abba"));
        assertTrue(Recursion.isPalindrome3("racecar"));
        assertTrue( Recursion.isPalindrome3("q"));

        assertTrue(! Recursion.isPalindrome3("qwerty"));
        assertTrue(! Recursion.isPalindrome3("asdwsa"));
    }
}