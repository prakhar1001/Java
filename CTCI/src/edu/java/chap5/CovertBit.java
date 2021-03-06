package edu.java.chap5;

/*
 * write a function to determine the number of bits required to convert integer A to integer B
 * input : 31, 14
 * output: 2
 * 
 */

public class CovertBit {

	public static int Count(int input){
		String st = Integer.toBinaryString(input);
		int result = 0;
		for(int i = 0; i<st.length(); i++){
			if(st.charAt(i) == '1'){
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 31;
		int y = 14;
		System.out.println(Count(x^y));
		System.out.println(Integer.toBinaryString(~0));
	}

}
