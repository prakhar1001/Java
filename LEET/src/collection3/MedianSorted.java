package collection3;

/*
 * There are two sorted arrays A and B of size m and n respectively. Find the
 *  median of the two sorted arrays. The overall run time complexity should
 be O(log (m+n)).
 */
public class MedianSorted {

	public static double findMedianSortedArrays(int A[], int B[]) {
		if(A==null &&B==null) return 0.0;
		if(A==null){
			if(B.length%2==0){
				return ((double)B[B.length/2-1]+(double)B[B.length/2])/2;
			} else {
				return (double)B[B.length/2];
			}
		} 
		
		if(B==null){
			if(A.length%2==0){
				return ((double)A[A.length/2-1]+(double)A[A.length/2])/2;
			} else {
				return (double)A[A.length/2];
			}
		}
		
		if(A[A.length-1]<B[0]){
			if(A.length<B.length){
				if((A.length+B.length)%2 ==0){
					return ((double)B[(A.length+B.length)/2-1-A.length]+(double)B[(A.length+B.length)/2-A.length])/2;
				} else {
					return (double)B[(A.length+B.length)/2-A.length];
				}
			} else if(A.length == B.length){
				return ((double)A[A.length-1]+(double)B[0])/2;
			} else {
				if((A.length+B.length)%2 ==0){
					return ((double)A[(A.length+B.length)/2-1]+(double)A[(A.length+B.length)/2])/2;
				} else {
					return (double)A[(A.length+B.length)/2];
				}
			}
		}
		
		if(B[B.length-1]<A[0]){
			if(B.length<A.length){
				if((A.length+B.length)%2 ==0){
					return ((double)A[(A.length+B.length)/2-1-A.length]+(double)A[(A.length+B.length)/2-A.length])/2;
				} else {
					return (double)A[(A.length+B.length)/2-A.length];
				}
			} else if(A.length == B.length){
				return ((double)B[B.length-1]+(double)A[0])/2;
			} else {
				if((A.length+B.length)%2 ==0){
					return ((double)B[(A.length+B.length)/2-1]+(double)B[(A.length+B.length)/2])/2;
				} else {
					return (double)B[(A.length+B.length)/2];
				}
			}
		}
		
		return -1.0;
		//if(A[A.length-1]>B[0]&&A.length>=B.length) return A[]
		//return findk(A, B,);
	}
	
	public static double findk(int A[], int B[], int pos){
		//pos-1;
		int valuea = A[(A.length-1)/2];
		int posb = pos-1-(A.length-1)/2;
		if(valuea>B[posb-1]&&valuea<B[posb]){
			return (double)valuea;
		} else if(valuea<B[posb-1]){
			
		} else if(valuea>B[posb]){
			
		}
		return 0.0;
	}

	public static int findone(int A[], int start, int end, int pos){
		return A[start+pos];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test 1: A= null, B = null
		System.out.println(findMedianSortedArrays(null,null));
		
		//test 2: A[1,2,3], B = null
		int[] a = {1,2,3};
		System.out.println(findMedianSortedArrays(a,null));
		
		//test 3: A null, B [2,4,5,7]
		int[] b = {2,4,5,7};
		System.out.println(findMedianSortedArrays(null,b));
		
		//test 4: A [1,2,3] B[5,7,9]
		int[] c={5,7,9};
		System.out.println(findMedianSortedArrays(a,c));
		
		//test 5: d[5,6,7] e[1,2,3,4]
		int[] d = {5,6,7};
		int[] e = {1,2,3,4};
		System.out.println(findMedianSortedArrays(d,e));
		
	}

}
