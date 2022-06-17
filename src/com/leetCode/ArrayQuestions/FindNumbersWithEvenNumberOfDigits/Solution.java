package com.leetCode.ArrayQuestions.FindNumbersWithEvenNumberOfDigits;

class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        int result=0;
        for (int i = 0; i <nums.length ; i++) {
            while(nums[i]>0){
                count++;
                nums[i]=nums[i]/10;

            }
            if(count%2==0){
                result++;
            }
        }
        return result;
    }
}
