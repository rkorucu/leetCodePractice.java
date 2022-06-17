package com.leetCode.ArrayQuestions.FindTowNumbersAddUp;

class CheckSum{

    public static int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2]; // to store the pair of values.

        for (int i = 0; i < arr.length; i++) { //traverse arr
            for (int j = i + 1; j < arr.length; j++) { //traverse arr again .index i+1 to traverse
                if (arr[i] + arr[j] == n) { // find where sum is equal to n
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result; // return the pair of numbers
                }
            }
        }
        return arr;
    }
}
