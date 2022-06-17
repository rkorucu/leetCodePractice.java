package com.leetCode.ArrayQuestions.MaxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentNumber = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentNumber += 1;
                max = Math.max(max, currentNumber);

            } else {
                currentNumber = 0;
            }

        }
        return max;
    }
}