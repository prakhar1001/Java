package collection1;

import java.util.Arrays;

/*
 * Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */
public class TwoSum {

	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		int temp1 =0;
		int temp2 = 0;
		int[] num = new int[numbers.length];
		for(int i = 0;i<numbers.length;i++){
        	num[i] = numbers[i];
        }
		Arrays.sort(numbers);
		
		int j = numbers.length-1;
        for(int i = 0; i<numbers.length-1;){
        	
        	if((numbers[i]+numbers[j])==target) {
        		temp1 = numbers[i];
        		temp2 = numbers[j];
        		break;
        	} else if((numbers[i]+numbers[j])<target) {
        		i++;
        	} else {
        		j--;
        	}
        }
        System.out.println(temp1+" "+temp2);
        for(int i = 0;i<num.length;i++){
        	System.out.println(num[i]);
        	if(num[i]==temp1){
        		result[0]=i+1;
        		temp1=-1;
        	} else if(num[i] == temp2){
        		result[1] = i+1;
        	}
        }
        if(result[0]>result[1]){
        	int t = result[0];
        	result[0] = result[1];
        	result[1] = t;
        }
        return result;
    }
	
	public static void main(String[] args) {

		int[] numbers={0,4,3,0};
		int target=0;
		System.out.println(twoSum(numbers, target)[0]);

	}

}
