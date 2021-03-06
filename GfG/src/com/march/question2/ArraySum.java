package com.march.question2;

/*
 * Q1.Write a C program that, given an array A[] of n numbers and another number x, 
determines whether or not there exist two elements in S whose sum is exactly x.
 */

public class ArraySum {
	
	public static boolean checkSum(int[] arr, int x){
		int totalLen = 0;
		for(int i = arr.length-1;i>0;i--){
			totalLen = totalLen + i;
		}
		int[] result = new int[totalLen];
		//build result int array
		int k = 0;
		for(int i = 0;i<arr.length-1;i++){
			for(int j = i+1; j<arr.length;j++){
				result[k] = arr[i]+arr[j];
				//System.out.println(k+" "+result[k]+" "+arr[i]+" "+arr[j]);
				if(x == result[k]) {
					return true;
				}
				k++;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,7,3,4,6};
		int x = 9;
		System.out.println(checkSum(arr, x));
	}

}
