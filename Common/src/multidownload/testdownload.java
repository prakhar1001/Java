package multidownload;




public class testdownload {

/*	private static int foo(int x, int y) {
		  if(x<=0) return 1;
		  if(x<0) {
		      System.out.println("undefined");
		      return 0;
		  }
		  return foo(x - 1, x * y)*x;
		}
	*/
	private static int foo(int x, int y) {
		  if(x<=0) return y;
		  if(x<0) {
		      System.out.println("undefined");
		      return 0;
		  }
		  return foo(x - 1, x * y);
		}

		private static int bar(int z) {
		  return foo(z, 1);
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(bar(4));
System.out.println(bar(2));
System.out.println(bar(-3));
	}

}
