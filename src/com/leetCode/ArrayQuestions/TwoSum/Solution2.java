package com.leetCode.ArrayQuestions.TwoSum;

//Brute Force Solution O(n2)
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1 ; i++){
            int j = i + 1;
            while(i < nums.length  - 1 && j < nums.length){
                int sum = nums[i] + nums[j];
                if(target == sum){
                    return new int[] {i , j};
                }else if(target != sum){
                    j++;
                }
            }
        }
        return new int[] {-1 , -1};
    }
}


/**
//  Using HashMap O(n)

class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer , Integer>map = new HashMap<Integer , Integer>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i] , i);
        }
        return ans;
    }
}
 */