package com.leetCode.ArrayQuestions.FindSecondMaxValueInArray;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {9, 2, 3, 6, 8, 2, 3};
        System.out.println(findSecondMaximum(arr));
    }

    public static int findSecondMaximum(int[] arr) {

        int max = Integer.MIN_VALUE;
        ;
        int secondmax = Integer.MIN_VALUE;

        // Find the maximum value in the array by comparing each index with max
        // If an element is greater than max then update max to be equal to it
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

        }//end of for-loop

        // Find the second maximum value by comparing each index with secondmax
        // If an element is greater than secondmax and not equal to previously
        // calculated max, then update secondmax to be equal to that element.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondmax && arr[i] < max)
                secondmax = arr[i];

        }//end of for-loop

        return secondmax;
    }
}
