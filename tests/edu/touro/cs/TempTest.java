package edu.touro.cs;

import static org.junit.jupiter.api.Assertions.*;

// TODO : Replace this file with your code

class TempTest {

    @org.junit.jupiter.api.Test
    void factorial() {
        int actual = Recursion.factorial(5);

        assertEquals(120, actual);
    }


    @org.junit.jupiter.api.Test
    void isPalindrome() {
        boolean actual = Recursion.isPalindrome("racecar");

        assertEquals(true, actual);
    }

    @org.junit.jupiter.api.Test
    void isPalindrome2() {
        boolean actual = Recursion.isPalindrome("racecat");

        assertEquals(false, actual);
    }
}