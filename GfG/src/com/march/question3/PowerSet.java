package com.march.question3;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Power Set. Power set P(S) of a set S is the set of all subsets of S. For example 
S = {a, b, c} then P(s) = {{}, {a}, {b}, {c}, {a,b}, {a, c}, {b, c}, {a, b, c}}.
If S has n elements in it then P(s) will have 2^n elements.
 */

public class PowerSet {
	
	public static LinkedList<String> getPower(char[] arr){
		LinkedList<String> result = new LinkedList<String>();
		result.add("{}");
		int len = (int)Math.pow(2, arr.length);
		for(int i = 1;i<len;i++){
			String str = pattern(i,len);
			String set = "";
			for(int j = 0; j<str.length();j++){
				if(str.charAt(j)!='0'){
					set = set.concat(arr[j]+"");
				}
			}
			result.add(set);
		}
		return result;
	}
	
	public static String pattern(int i, int len){
		String temp = Integer.toBinaryString(i);
		String temp2 = Integer.toBinaryString(len-1);
		if(temp.length()!=temp2.length()){
			int len1 = temp.length();
			int len2 = temp2.length();
			for(int j =0;j<(len2-len1);j++){
				temp = "0".concat(temp);
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		//assume the Set is an array input.
		char[] arr = {'a','b','c','d'};
		System.out.println(pattern(1,8));
		LinkedList<String> list = new LinkedList<String>();
		list = getPower(arr);
		Iterator<String> it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
