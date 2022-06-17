package com.leetCode.ArrayQuestions.FindMinimumValue;

import java.util.Arrays;


public class Solution {
    public static void main(String args[]) {

        int[] arr = { 9, 2, 3, 6};

        System.out.print("Array : ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        int min = findMinimum(arr);
        System.out.println("Minimum in the Array: " + min);

    }

    public static int findMinimum(int[] arr) {
        Arrays.sort(arr);
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
             temp=arr[0];
        }
        return temp;
    }
}
