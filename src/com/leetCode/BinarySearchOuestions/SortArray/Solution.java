package com.leetCode.BinarySearchOuestions.SortArray;

public class Solution {
    static int binarySearch(int[] nums, int target) {
        // The time complexity of this solution is logarithmic,
        //O(log n)
        //.The space complexity of this solution is constant, O(1)
        //.
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            // Finding the mid using floor division
            int mid = low + ((high - low) / 2);

            // Target value is present at the middle of the array
            if (nums[mid] == target) {
                return mid;
            }

            // Target value is present in the low sub-array
            else if (target < nums[mid]) {
                high = mid - 1;
            }

            // Target value is present in the high sub-array
            else if (target > nums[mid]) {
                low = mid + 1;
            }
        }

        // Target value is not present in the array
        return -1;
    }
}
