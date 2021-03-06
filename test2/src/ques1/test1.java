package ques1;

import java.util.BitSet;

public class test1 {

	public static int solution(String S) {
		// build char dictionary, Assume the String only contains ASCII character
		BitSet bs = new BitSet(256);

		char[] s_array = S.toCharArray();
		for (char c : s_array) {
			bs.flip(c);
		}
		int count = 0;
		for (int i = 0; i < bs.size(); i++) {
			if (bs.get(i)) {
				count++;
			}
		}
		if (count < 2) {
			return 1;
		}
		return 0;
	}

	public static boolean isPalin(String s) {
		// build char dictionary
		BitSet bs = new BitSet(256);

		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			bs.flip(c);
		}
		int count = 0;
		for (int i = 0; i < bs.size(); i++) {
			if (bs.get(i)) {
				count++;
			}
		}
		if (count < 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitSet bs = new BitSet(27);
		bs.flip(2);
		bs.flip(2);
		System.out.println(bs.get(0));
		// for (int i = 0; i < bs.size(); i++) {
		// System.out.println(bs.get(i));
		// }

		String s = "neveriddireven";
		System.out.println(isPalin(s));
		String s1 = "aabcba";
		System.out.println(solution(s1));
	}

}
