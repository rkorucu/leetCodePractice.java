package com.leetCode.StackAndQueues.MinStack;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Stack<Integer> main=new Stack<>();


        main.push(5);
        main.push(9);
        main.push(-3);
        main.push(-8);
        main.push(-4);
        main.push(2);

//        System.out.println( main.peek());
        System.out.println( main.pop());
//        System.out.println( main.peek());
//        System.out.println(main.size());
//        for (int i = 0; i <main.size() ; i++) {
//            System.out.println(main.pop());
//        }
    }
}
