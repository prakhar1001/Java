package collection3;

import java.util.ArrayList;

/*
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].
 */
public class SpiralMatrix {
	
	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
		if(matrix.length==0) return null;
		
        ArrayList<Integer> arr = new ArrayList<Integer>();
		int posup = 0;
        int posdown = matrix.length-1;
        int posleft = 0;
        int posright = matrix[0].length-1;
        
        //put the up line
        while(true){
        for(int i = posleft;i<posright;i++){
        	arr.add(matrix[posup][i]);
        }
        for(int i = posup;i<posdown;i++){
        	arr.add(matrix[i][posright]);
        }
        posup++;
        posright--;
        System.out.println("!"+posup+" "+posright+" "+posleft+" "+posdown);
        
        if(posup==posdown){
        	for(int i = posright+1;i>=posright;i--){
        		arr.add(matrix[posup][i]);
        	}
        	break;
        } else if(posup>posdown){
        	for(int i = posright+1;i<=posleft;i++){
        		arr.add(matrix[posup-1][i]);
        	}
        	break;
        }
        
        else{
        	for(int i = posright+1;i>posleft;i--){
        		arr.add(matrix[posdown][i]);
        	}
        	for(int i = posdown;i>posup-1;i--){
        		arr.add(matrix[i][posleft]);
        	}
        	posdown--;
        	posleft++;
        	}
        System.out.println(posup+" "+posright+" "+posleft+" "+posdown);
        
        }
        
        for(int i = 0;i<arr.size();i++){
        	System.out.print(arr.get(i)+" ");
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
		spiralOrder(new int[][] {{1,2,3},{4, 5,6},{7,8,9}});
		
	}

}
