package collection3;

/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 */

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<s.length();i++){
			 if(s.charAt(i)>96&&s.charAt(i)<123){
				 sb.append(s.charAt(i));
			 } else if(s.charAt(i)>64&&s.charAt(i)<91){
				 sb.append((char)(s.charAt(i)+32));
			 } else if(s.charAt(i)>47&&s.charAt(i)<58){
				 sb.append(s.charAt(i));
			 }
		}
		String temp = sb.toString();
		for(int i = 0;i<temp.length()/2;i++){
			if(temp.charAt(i)!=temp.charAt(temp.length()-1-i)){
				return false;
			}
		}
		
			/*if(temp>96&&temp<123){
				if(temp2 == temp ||temp2+32==temp){
					continue;
				} else {
					return false;
				}
			} else if(temp>64&&temp<91){
				if(temp2 == temp ||temp2-32 ==temp){
					continue;
				}else {
					return false;
				}
			} else {
				continue;
			}*/
		
		System.out.println(temp);
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = '9';
		int b ='b';
		char c = 'A';
		char d = 'Z';
		char e = 'z';
		System.out.println((int)a);
		System.out.println(b);
		System.out.println((int)c);
		System.out.println((int)d);
		System.out.println((int)e);
		
		System.out.println(isPalindrome("1a2"));
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}

}
