package com.leetCode.StackAndQueues.StackWithQueue;

import java.util.Stack;


public class Solution {
    public static void main(String[] args) {
        Solution stack=new Solution();

        stack.enqueue(4);
        stack.enqueue(56);
        stack.enqueue(43);
        System.out.println(stack.dequeue());
        stack.enqueue(100);
//
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());
        System.out.println(stack.dequeue());

    }




    //*********************************************************************************************************

    private Stack<Integer> enqueueStack = new Stack<>();
    private Stack<Integer> dequeueStack = new Stack<>();

//adding an item to the que is 0(1) operation
    public void enqueue(int item) {
        this. enqueueStack.push(item);
    }
    public int dequeue(){
        //no item in the stacks
        if(enqueueStack.isEmpty() && dequeueStack.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        //if dequeue is empty , we have to add item inside
        if(dequeueStack.isEmpty()){
            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }
        //otherwise, we just have to pop off an item in 0(1)
        return dequeueStack.pop();
    }


}




