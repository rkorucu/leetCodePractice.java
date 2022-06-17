package com.leetCode.StackAndQueues.MaxStack;

import java.util.Stack;

public class MaxItemStack {
    public static void main(String[] args) {

        MaxItemStack solution = new MaxItemStack();
        solution.push(23);
        solution.push(45);
        solution.push(67);
        solution.push(88);
        solution.push(43);

        System.out.println(solution.getMaxItem());
    }
    //************************************************************************************************************
    private Stack<Integer> mainStack=new Stack<>();  // original stack
  private  Stack<Integer> maxStack= new Stack<>() ;  // tracking max item stack

    public  void push(int item ){

        //push the new item on stack
        mainStack.push(item);

        //first item is the same in both stacks

        if(mainStack.size()==1){
            maxStack.push(item);
            return;
        }
        //first item is the largest so far; we insert it on stackv

        if(item>maxStack.peek()){
            maxStack.push(item);

        }else{
            //if not the lasrgest one then we duplicate the largest one on maxStack
            maxStack.push(maxStack.peek());
        }
    }
    //we're removing an item ,we remove both oif stacks.
    public int pop(){
       maxStack.pop();
       return mainStack.pop();
    }
    //max item is the largest item we have inserted into the maxStack.0(1)
    public int getMaxItem(){
        return maxStack.peek();
    }
    }


