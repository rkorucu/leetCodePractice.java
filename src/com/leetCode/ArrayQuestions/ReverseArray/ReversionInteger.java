package com.leetCode.ArrayQuestions.ReverseArray;

public class ReversionInteger {

public static int reversion(int num){
    int reverse=0;
    int remain=0;
    while(num>0){
        remain=num%10;
        num=num/10;
        reverse=reverse*10+remain;

    }
    return reverse;
}
}
