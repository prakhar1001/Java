package edu.java.chap5;

/*
 * given a positive integer, print the next smallest and the next largest number that have the 
 * same number of 1 bits in their binary representation.
 */

public class SmallLarge {

	public static int CountOnes(int input){
		String st = Integer.toBinaryString(input);
		int result = 0;
		for(int i = 0; i<st.length(); i++){
			if(st.charAt(i) == '1'){
				result++;
			}
		}
		return result;
	}
	
	public static int NextLarge(int input){
		int result = input+1;
		int ones = CountOnes(input);
		while(result<2147483647){
			if(CountOnes(result) == ones){
				return result;
			}
			result++;
		}
		System.out.println("no such large number");
		return 0;
	}
	
	public static int NextSmall(int input){
		int result = input-1;
		int ones = CountOnes(input);
		while(result >= 0){
			if(CountOnes(result) == ones){
				return result;
			}
			result--;
		}
		System.out.println("no such small number");
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(NextLarge(22));
		System.out.println(NextSmall(22));
	}

}
