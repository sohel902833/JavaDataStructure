package com.sohrab.Stack;

public class Stack {
    int stack[];
    int top=0;
    int maxLength;

    public Stack(int length){
         stack=new int[length];
         this.maxLength=length;
    }

    public void push(int data){
        if(top==maxLength){
            System.out.println("Stack Overflow");
        }else {
            stack[top] = data;
            top++;
        }
    }
    public int pick(){
        int data;

            data=top==0?0:stack[top-1];
            stack[top-1] = 0;
            return data;

    }
    public int size(){
        return  top;
    }
    public boolean isEmpty(){
       return top==0?true:false;
    }
    public int pop(){
        int data;
        top--;
        data=stack[top];
        stack[top]=0;

        return  data;
    }

    public void show(){
        if(top==0){
            System.out.println("null");
        }else {
            for (int i = 0; i < top; i++) {
                System.out.print(stack[i] + " ");
            }
        }
    }
}
