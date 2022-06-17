package com.leetCode.ArrayQuestions.FindCommonNumber;

public class Solution2 {
    static int findLowIndex(int[] nums, int target) {
        int low =0;
        int max=nums.length-1;
        int mid=low +(max-low)/2;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[mid]<target){
                low=mid+1;
            }else{
               max=mid-1;
            }
        }
        return -2;
    }

    static int findHighIndex(int[] nums, int target) {

        return -2;
    }
}
