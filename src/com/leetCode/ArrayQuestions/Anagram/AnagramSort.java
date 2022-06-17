package com.leetCode.ArrayQuestions.Anagram;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AnagramSort {
    private static final int CHARACTER_RANGE =26 ;

    public static void main(String[] args) {



    }

    /*
    sort the letter of string
   0(Nlog N)  this the "bottleneck" of the algo
   consider all the letter one by one and we have to compare these letters
     */


    public static boolean anagram(String  s1,String s2){
    char[]a1=s1.toCharArray();
    char[]a2=s2.toCharArray();
       Arrays.sort(a1);
        Arrays.sort(a2);

        if(a1.length!= a2.length)return false;

        for (int i = 0; i < a1.length; i++) {
            if(a1[i]!=a2[1]){
                return false;
            }
            return  true;
        }
        return true;
        }


}
