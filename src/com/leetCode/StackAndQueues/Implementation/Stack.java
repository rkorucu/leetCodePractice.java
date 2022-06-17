package com.leetCode.StackAndQueues.Implementation;

public class Stack<I extends Number> {
    public static void main(String[] args) {


        java.util.Stack<String> stack = new java.util.Stack<>();

      stack.push("Adam");
        stack.push("Eric");
        stack.push("Bill");
        stack.push("Jeff");
        stack.push("Elon");

     // peek() run in 0(1) and returns the last item we have inserted
        //without Removing It!!

        //pop() in 0(1) that is going to remove the last item (+ returns the value )

//        System.out.println(stack.peek());
//        System.out.println(stack.size());
      // It execute LIFO


        // the first in ,last out in the stack

         while (!stack.isEmpty()){
             System.out.println(stack.pop());
         }
    }
}
