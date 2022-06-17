package com.leetCode.ArrayQuestions.IntersectionOfTwoArrays;

import java.util.HashSet;

public class Solution3 {
    public int[] intersection(int[] nums1, int[] nums2) {
        //create hashset to copy array numbers
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums1) {
            set.add(i);
        }

        HashSet<Integer> intersection = new HashSet<Integer>();
        for (int i : nums2) {
            if (set.contains(i)) {
                intersection.add(i);
            }
        }
        int [] result = new int[intersection.size()];
        int index = 0;
        for (int i : intersection) {
            result[index++] = i;


        }
        return result;
    }
}

