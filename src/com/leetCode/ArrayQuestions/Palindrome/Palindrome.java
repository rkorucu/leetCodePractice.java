package com.leetCode.ArrayQuestions.Palindrome;

public class Palindrome {

    public static boolean pal(String rev) {


        // it has o(N) linear running time comp
        int forward = 0;
        int backward = rev.length() - 1;

        while (forward < backward) {
            if (rev.charAt(forward) != rev.charAt(backward)) {
                return false;
            }

                forward++;
                backward--;


        }
        return true;

    }
}

