package com.march.question1;

/*
 * Q3. Given a number having only one ��1�� and all other ��0��s in its binary representation, find position of the only set bit. 
Source: Microsoft Interview | 18
 */
public class FindOnePos {
	
	public static void find(int n){
		int number = 0;
		while(n!=0){
			n=n>>1;
			number = number + 1;
		}
		int[] arr = new int[number];
		arr[0] = 1;
		for(int i = 0;i < number; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String... args){
		int n = 16;
		find(n);
		//find(16);
	}
	

}
