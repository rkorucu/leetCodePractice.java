package com.leetCode.ArrayQuestions.TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Time O(n)
     * Space O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        // Space O(n)
        Map<Integer, Integer> map = new HashMap<>();
        /**
         * Time O(n)
         *  - for loop: O(n)
         *  - HashMap APIs: O(1)
         */
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return nums;
    }
}