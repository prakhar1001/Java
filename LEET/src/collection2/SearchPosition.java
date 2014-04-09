package collection2;

/*
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 �� 2
 [1,3,5,6], 2 �� 1
 [1,3,5,6], 7 �� 4
 [1,3,5,6], 0 �� 0
 */

public class SearchPosition {

	public static int searchInsert(int[] A, int target) {
		System.out.println(position(A,target,0,A.length-1));
		return 0;
	}

	public static int position(int[] A, int target, int start, int end){
		int mid = (start+end)/2;
		//System.out.println(mid);
		if(A[mid]==target){
			return mid;
		} else if(A[mid]>target){
			if(mid-1<0||A[mid-1]<target){
				return mid;
			}
			return position(A,target,start,mid);
		} else {
			if(mid+1>A.length-1||A[mid+1]>target){
				return mid+1;
			}
			return position(A, target,mid+1,end);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1};
		searchInsert(A,2);
	}

}
