package edu.java;

public class test1 {

	public static void modPrint(int number, int mode){
		int temp = number/mode;
		int restidual = number-temp*mode;
		if (temp>=1){
			if(restidual == 0&&temp >1){
				modPrint(temp-1, mode);
			}
			else if(restidual >0){
				modPrint(temp, mode);
			}
		}
		int mod = (number-temp*mode)%mode;
		String[] base2 = {"d","a","b","c"};
		System.out.print(base2[mod]);
	}

	public static void main(String[] args) {
		String[] base = {"a","b","c","d","aa","ab","ac","ad","ba","bb","bc","bd","ca","cb","cc","cd","da","db","dc"};
		//modPrint(8,4);
		//
		//
		//System.out.println(3%7);
		//System.out.println(7%11);
		for(int i = 1; i<135; i++){
			modPrint(i,4);
			System.out.println();
		}
	}
}
