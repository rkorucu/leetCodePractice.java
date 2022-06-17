package com.leetCode.Recursion.SumOFInteger;

public class Solution {
    public static int sumAll(int num){
        //base case
          // there is not any less than 1 integer number so this reason our base case is num== 1
        if(num==1){
            return num;
        }
        /// in mathematical describe : n+ (n-1)
       return num+sumAll(num-1);


    }

    public static void main(String[] args) {
        int sum=5;

        System.out.println(sumAll(5));
    }

}
