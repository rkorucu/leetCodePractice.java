package com.leetCode.StackAndQueues.Implementation;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {

//  it processes first come and first out .
       Queue<Integer> queue=new LinkedList<>();
        //add method inserted a new item  into the queue in O(1)

     queue.add(1);
     queue.add(2);
     queue.add(3);

//        System.out.println(queue.element());
//        System.out.println(queue.peek());
      while(!queue.isEmpty()){
          //remove method is  dequeue() method in O(1)
          System.out.println(queue.remove());

}
    }
}