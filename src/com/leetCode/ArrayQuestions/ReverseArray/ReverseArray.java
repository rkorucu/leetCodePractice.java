package com.leetCode.ArrayQuestions.ReverseArray;

import java.util.Arrays;



public class ReverseArray {
    public static void main(String[] args) {
// Second way :  Array example solve
        int[] x={4,2,6,1,7};

        for (int i = 0; i <x.length/2 ; i++) {
            int temp=x[i];
            x[i]=x[x.length-i-1];
            x[x.length-i-1]=temp;

        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

    }

    }
//--------------------------------------------------------------------------------------------------------------//

    // no need for extra memory (in place algorithms)
// O(N) Linear running time
    //Swap method
    public int[] solve(int[] nums) {

        int lowIndex = 0;
        int highIndex = nums.length - 1;


        while (lowIndex < highIndex) {
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;

        }
        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }




}
