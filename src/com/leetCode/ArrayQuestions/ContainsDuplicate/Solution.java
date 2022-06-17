package com.leetCode.ArrayQuestions.ContainsDuplicate;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int temp []=new int[]{1,2,3,4,4};
        com.leetCode.ArrayQuestions.ContainsDuplicate.Solution containsDuplicate=new Solution();
        System.out.println( containsDuplicate.containsDuplicate(temp));
    }
    public boolean containsDuplicate(int[] nums) {

        if(nums.length==0){
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-1 ; i++) {
                if(nums[i]==nums[i+1]){
                 continue;
                }else{
                    return true;
                }
            }



       return false;
    }


}
