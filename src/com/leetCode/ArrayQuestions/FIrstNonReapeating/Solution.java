package com.leetCode.ArrayQuestions.FIrstNonReapeating;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {9, 2, 3, 9,2, 6, 6};
        System.out.println(findFirstUnique(arr));
    }

    public static int findFirstUnique(int[] arr) {
        //Inside Inner Loop Check Each index of outerLoop If it's repeated in array
        //If it's not repeated then return this as first unique Integer
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    break;
                }
            }
            if (j == arr.length) {
                return arr[i];
            }

        }
        return -1;
    }
}

