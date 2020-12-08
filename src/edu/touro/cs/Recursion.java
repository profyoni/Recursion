package edu.touro.cs;

// TODO : Replace this file with your code
// Recursion is a useful and _sometimes_ needed tool
// Prefer, in general, iteration over recursion
public class Recursion {
    // 5! = 5 * 4 * 3 * 2 * 1
    // Recursive Case
    // n! = n * (n-1)!
    // 5! = 5 * 4!
    // 4! = 4 * 3!
    // 3! = 3 * 2!
    // 2! = 1 * 1!
    // 1! = 1 * 0!

    // Base Case = Simplest case without calling itself
    // 0! = 1
    public static int factorial(int n)
    {
       return n==0 ? 1: // base case
         n * factorial(n-1); // recursive case
    }


    public static boolean isPalindrome2(String s) {
        for( int startIndex = 0, endIndex = s.length()-1;
             startIndex < endIndex;
             startIndex++, endIndex--)
        {
            if (s.charAt(startIndex) != s.charAt(endIndex))
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(String s) {
        // Base case "", 1 character
        // Recurive 2+ characters
        for( int startIndex = 0, endIndex = s.length()-1;
             startIndex < endIndex;
             startIndex++, endIndex--)
        {
            if (s.charAt(startIndex) != s.charAt(endIndex))
                return false;
        }
        return true;
    }
}
