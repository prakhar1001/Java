package collection3;

public class LastWord {

	public static int lengthOfLastWord(String s) {
		s=s.trim();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ')
                return s.length()-1-i;
        }
        return s.length();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World ";
		System.out.println(lengthOfLastWord(s));
	}

}
