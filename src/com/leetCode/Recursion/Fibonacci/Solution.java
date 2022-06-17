package com.leetCode.Recursion.Fibonacci;

public class Solution {
    public static int fibnoc(int num ) {

        int a = 0, b = 1, c;
        if (num== 0)
            return a;
        for (int i = 2; i <= num; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fibnoc(n));
    }
}

