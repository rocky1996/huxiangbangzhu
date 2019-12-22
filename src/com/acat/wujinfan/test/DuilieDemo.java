package com.acat.wujinfan.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * (栈:先进后出(LIFO),队列:先进先出(FIFO))
 */
public class DuilieDemo {

    /**
     * 两个栈实现一个队列
     * //////////////////////////////////////////////////////////
     */
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        //入队列就把需要存放的元素插入到栈1中
        stack1.push(node);
    }

    public int pop(){
        //出队列就把有元素的栈中的元素出栈，再进栈到没有元素的栈中，然后再出栈
        if(stack2.empty()){
            //此时默认stack2为空
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /**
     * 连个队列模拟一个堆栈
     * //////////////////////////////////////////////////////////
     */
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push2(int node){
        queue1.add(node);
    }

    public int pop2(){
        if(queue1.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        while(queue1.size() != 1){//将队列1中除队尾元素外的元素全部出队列并入到队列2中
            queue2.add(queue1.remove());
        }

        while(!queue2.isEmpty()){//再将队列2中的元素全部出队列并重新入到队列1中
            queue1.add(queue2.remove());
        }

        return queue1.remove();
    }

}