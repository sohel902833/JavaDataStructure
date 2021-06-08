package com.sohrab.LinkedList;

public class Main {

    public static void main(String[] args) {
	    LinkedList linkedList=new LinkedList();
	    linkedList.insert(25);
	    linkedList.insert(14);
	    linkedList.insert(16);
	    linkedList.insert(17);
	    linkedList.insert(18);
	    linkedList.insertAtFirst(55);
	    linkedList.insertAt(2,48);
	    linkedList.insertAt(4,49);
	    linkedList.deleteAt(5);
	    linkedList.show();
    }
}
