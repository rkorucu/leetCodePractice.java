package com.leetCode.ArrayQuestions.Anagram;

public class count {
    private static final int CHARACTER_RANGE =26 ;
    // O(N)
    /*
    We'll increment the counts for each character in the first string,
     and decrement the count for each character in the second.
     If the two strings are anagrams, then the result will be that everything balances to 0.

     This solution is faster with the time complexity of O(n).
      However, it needs extra space for the counting array. At 256 integers, for ASCII that's not too bad.
     */

    public boolean isAnagramCounting(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        System.out.println(count);
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;   // string1.charAt(i)-'a'
            count[string2.charAt(i)]--;    //string1.charAt(i)-'a'
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
