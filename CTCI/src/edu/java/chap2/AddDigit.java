package edu.java.chap2;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * input : 7->1->6 + 5->9->2 so 617+295 = 912
 * output: 2->1->9
 * 
 * input : 6->1->7 + 2->9->5
 * output: 9->1->2
 * 
 */
public class AddDigit {

	public static void backadd(LinkedList<Integer> list1, LinkedList<Integer> list2){
		int result = back2int(list1)+back2int(list2);
		System.out.println(result);
	}
	
	public static void frontadd(LinkedList<Integer> list1, LinkedList<Integer> list2){
		int result = front2int(list1)+front2int(list2);
		System.out.println(result);
	}
	
	public static int front2int(LinkedList<Integer> list){
		int result = 0;
		int large = list.size()-1;
		Iterator<Integer> it = list.listIterator();
		while(it.hasNext()){
			result +=Math.pow(10,large--)*it.next();
		}
		return result;
	}
	
	public static int back2int(LinkedList<Integer> list){
		int result = 0;
		int large = 0;
		
		Iterator<Integer> it = list.listIterator();
		while(it.hasNext()){
			result +=Math.pow(10,large++)*it.next();
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(7);
		list1.add(1);
		list1.add(6);
		list2.add(5);
		list2.add(9);
		list2.add(2);
		
		System.out.println(front2int(list1));
		System.out.println(front2int(list2));
		System.out.println(back2int(list1));
		System.out.println(front2int(list2));
		
		backadd(list1,list2);
		frontadd(list1,list2);
	}

}
