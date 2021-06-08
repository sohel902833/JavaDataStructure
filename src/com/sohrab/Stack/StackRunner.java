package com.sohrab.Stack;

public class StackRunner {

    public static void main(String[] args) {
        Stack nums=new Stack(4);
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.push(30);
        nums.push(30);
        System.out.println("Delete: "+nums.pick());
        nums.push(30);


        nums.show();
        System.out.println("\nSize: "+nums.size());
        System.out.println("Is Empty: "+nums.isEmpty());

    }



}
