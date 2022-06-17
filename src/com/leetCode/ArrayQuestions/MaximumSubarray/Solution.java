package com.leetCode.ArrayQuestions.MaximumSubarray;
//The key idea is that we iterate over the entire array and either
// increase the previous sum if it is positive or start the summation again.
//And at each step, we update the answer (sum).
class Solution {
    public int maxSubArray(int[] nums) {

 int  cur=nums[0];
  int sum=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(cur<0){
                cur=nums[i];
            }else{
                cur+=nums[i];
            }
            if(cur>sum){
                sum=cur;
            }
        }
            return sum;
        }
}