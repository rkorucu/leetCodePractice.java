package com.leetCode.ArrayQuestions.ReArrangePositiveAndNegative;

public class Solution {
    public static void reArrange(int[] arr) {
        int currentIndex=0;
      int [] copyArray=new int[arr.length];

      //fill new array with negative values
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0) {
                copyArray[currentIndex++] = arr[i];
            }

            }
        //and also fill array with positive number
            for (int j = 0; j < arr.length ; j++) {
               if(arr[j]>=0){
                   copyArray[currentIndex++]=arr[j];
               }
            }
            //end copy array to original array.And execute array
            for (int j = 0; j <arr.length ; j++) {
                arr[j]=copyArray[j];

            }
        }

    public static void main(String args[]) {

        int[] arr = {2, 4, -6, 8, -5, -10};

        System.out.print("Array before re-arranging: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        reArrange(arr);

        System.out.print("Array after rearranging: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    }
