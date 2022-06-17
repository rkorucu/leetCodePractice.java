package com.leetCode.ArrayQuestions.ProductArrayExceptSelf;

public class Solution2 {
    public int[] productExceptSelf(int[] nums) {

        // this solution use extra memory
        int n= nums.length;
        int []  leftSide=new int[n];
        int []  rightSide=new int[n];

        int output[]=new int[n];
        //think that each case
        // there is any number when we start .
        leftSide[0]=1;
        // this same thinks is here.there is not any elements after last elements.(n-1)
        rightSide[n-1]=1;
  //for left side multi
        for (int i = 1; i <n ; i++) {
            leftSide[i]=nums[i-1]*leftSide[i-1];
            // right side multi
        }
        for (int i = n-2; i >=0; i--) {
            rightSide[i]=nums[i+1]*rightSide[i+1];
        }

        for (int i = 0; i <n ; i++) {
            output[i]=leftSide[i]*rightSide[i];

        }
        return output;
    }
}
