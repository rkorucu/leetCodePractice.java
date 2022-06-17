package com.leetCode.StackAndQueues.MinStack;

import com.leetCode.ArrayQuestions.ContainsDuplicate.Solution;

import java.util.Stack;

class MinStack {
    //create two stack

  Stack<Integer> minStack=new Stack<>();
    Stack<Integer> mainStack=new Stack<>();

    public void push(int val) {
       if(minStack.isEmpty() || val<=minStack.peek()){
           minStack.push(val);
       }
           mainStack.push(val);

    }

    public void pop() {
        if(mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
    mainStack.pop();
    }

    public int top() {

        return mainStack.peek();
    }

    public int getMin() {

  return minStack.peek();
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */