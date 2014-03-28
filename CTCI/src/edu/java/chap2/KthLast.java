package edu.java.chap2;

import java.util.LinkedList;

import java.util.Iterator;

//implement an algorithm to find the kth to last element of a singly linked list
public class KthLast {

	public static Object check1(LinkedList<Object> list, int times){
		Object result = null;
		Iterator<Object> it = list.iterator();
		for(int i = 0; i<times; i++){
			result = it.next();
		}
		return result;
	}
	
	public static int check2(Node node, int t){
		
		if(node.next==null){
			return 0;
		}
		int i = check2(node.next, t)+1;
		if(i == t){
			System.out.println(node.data);
		}
		return i;
		
	}
	
	//check3: similar to check2, use wrapper class to return the node and int
	
	//check4: use two linkedlist, first one add k and let the second and the first one add until null
	
	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Node node = new Node(0);
		node.appendToTail(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(4);
		node.appendToTail(5);
		
		
		System.out.println(check1(list,3));
		check2(node,3);
	}

}
