package edu.touro.cs;

import java.util.HashMap;

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
       if (n == 0)
           return 1; // base case
       int ret = n * factorial(n-1); // recursive case
       return ret;
    }
    public static int fibO1(int n) {
        double a = (1 + Math.sqrt(5))/2,
               b = (1 - Math.sqrt(5))/2;

        return (int) Math.round((Math.pow(a,n) - Math.pow(b,n))/Math.sqrt(5));
    }
    private static HashMap<Integer, Integer> memoizedFib = new HashMap<>();
    public static int fib(int n)
    {
        // memoize result from a previous
        if (n == 0 || n ==1)
            return n; // base case
        if (memoizedFib.containsKey(n))
            return memoizedFib.get(n);
        int ret = fib(n-2) + fib(n-1); // recursive case
        memoizedFib.put(n, ret);

        return ret;
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
