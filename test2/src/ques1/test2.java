package ques1;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix = {{2, 7, 5}, {3, 1, 1}, {2, 1, -7}, {0, 2, 1}, {1, 6, 8}};
		System.out.println(solution(matrix));
	}

	public static int solution(int [][]A){
		int []rowSum = new int[A.length];
		int []colSum = new int[A[0].length];

		for(int i = 0; i < A.length; i++){
			for(int a = 0; a < A[i].length; a++){
				rowSum[i] += A[i][a];
			}
		}


		for(int i = 0; i < A[0].length; i++){
			for(int a = 0; a < A.length; a++){
				colSum[i] += A[a][i];
			}
		}


//	   int rightSum = 0;
//	   int leftSum = 0;
//	 	for(int i = 1; i < rowSum.length; i++){
//	 	 rightSum += rowSum[i];
//	 	}
//
//	 	int count = 0;
//	 	for(int i = 0; i < rowSum.length - 1; i++){
//
//	 	 if(leftSum == rightSum){
//	 	 count++;
//	 	 }
//	 	 leftSum += rowSum[i];
//	 	 rightSum -= rowSum[i + 1];
//	 	}
//
//	  if(leftSum == 0)
//	  count ++;
//
//	 	rightSum = 0;
//	 	leftSum = 0;
//	 	for(int i = 1; i < colSum.length; i++){
//	 	 rightSum += colSum[i];
//	 	}
//
//	 	int count2 = 0;
//	 	for(int i = 0; i < colSum.length - 1; i++){
//
//	 	 if(leftSum == rightSum){
//	 	 count2++;
//	 	 }
//	 	 leftSum += colSum[i];
//	 	 rightSum -= colSum[i + 1];
//	 	}
//
//	  if(leftSum == 0)
//	  count2 ++;
int count = findEqual(rowSum);
int count2 = findEqual(colSum);
		return count * count2;

	}

	
	public static int solution2(int[][] A) {
        //compute each row sum and each column sum
        int[] sumR = new int[A.length];
        int[] sumC = new int[A[0].length];
        
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A[0].length;j++){
                sumR[i] = sumR[i] + A[i][j];
            }
        }
        
        for(int i = 0; i<A[0].length;i++){
            for(int j = 0; j<A.length;j++){
                sumC[i] = sumC[i] + A[j][i];
            }
        }
        int count1 = findEqual(sumR);
        int count2 = findEqual(sumC);
        
        return count1*count2;
    }
    
    public  static int findEqual(int[] arr){
        int sumUp = 0;
        int sumDown = 0;
        //count is to count the possible row number
        int count = 0;     
        for(int i = 1; i<arr.length;i++){
            sumUp = sumUp + arr[i];
        }
        
        for(int i = 0; i<arr.length-1;i++){
            if(sumUp == sumDown){
                count++;
            }
            sumUp = sumUp+arr[i];
            sumDown = sumDown - arr[i+1]; 
        }
        
        if(sumUp == 0){
            count++;
        }
        return count;
    }
    

}
