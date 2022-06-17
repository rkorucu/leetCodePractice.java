package com.leetCode.ArrayQuestions.FindNumbersWithEvenNumberOfDigits;

public class ConvertString {

    //Below is one of the optiomal solutions with time complexity - O(n)
    public int findNumbers(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            String number = Integer.toString(nums[i]);
            if(number.length()%2==0)
            {
                result++;
            }
        }
        return result;
    }
}
