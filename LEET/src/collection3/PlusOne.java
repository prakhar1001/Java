package collection3;

/*
 * Given a non-negative number represented as an array of digits, plus one 
 * to the number. The digits are stored such that the most significant digit
 * is at the head of the list.
 * 
 */

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		int flag = 1;
		for(int i = digits.length-1; i>=0;i--){
			if(flag ==0){
				return digits;
			}
			if(i==0&&digits[i]==0){
				digits[i]=1;
				return digits;
			}
			if(i==0 &&digits[i]==1){
				int[] digit = new int[digits.length+1];
				digit[0]=1;
				return digit;
			}
			if(digits[i]==0){
				flag = 0;
				digits[i] = 1;
			} else if(digits[i] ==1){
				flag = 1;
				digits[i] = 0;
			}
		}
		
        return null;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = null;
		int[] a2 = {1,1,1};
		int[] b1 = plusOne(a1);
		int[] b2 = plusOne(a2);
		
		for(int i = 0 ;i<b1.length;i++){
			System.out.print(b1[i]);
		}
		System.out.println();
		
		for(int i = 0 ;i<b2.length;i++){
			System.out.print(b2[i]);
		}
		System.out.println();
	}

}
