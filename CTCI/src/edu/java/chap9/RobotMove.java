package edu.java.chap9;
/*
 * a robot moving from (0,0) to (x,y), only to direction each time.
 * method move is good for original question
 * follow up: if there exist spot the robot can not step on
 * 
 */
public class RobotMove {

	public static int move(int x, int y){
		if(x==0 && y ==0){
			return 0;
		}
		else if(y== 0||x==0){
			return 1;
		} 
		else {
				return move(x-1,y)+move(x,y-1);
		}
	}
	
	public static int move2(int x, int y,int[] spotx,int[] spoty){
		if((x==0 && y ==0)||x<0||y<0){
			return 0;
		}
		else if(y== 0||x==0){
			return 1;
		} 
		else {
			if(check(x-1,spotx)&&check(y,spoty)){
				return move2(x,y-2,spotx,spoty);
			}
			else if(check(x,spotx)&&check(y-1,spoty))
				return move2(x-2,y,spotx,spoty);
			
			else {
				return move2(x-1,y,spotx,spoty)+move2(x,y-1,spotx,spoty);
			}
		}
	}
	
	public static void spotmove(int x, int y, int[] spotx, int[] spoty){
		x = checkEdge(x,spotx);
		y= checkEdge(y,spoty);
		System.out.println(x+" "+y);
		System.out.println(move2(3,3,spotx,spoty));
		
		
	}
	
	public static boolean check(int x, int[] spotx) {
		int size = spotx.length;
		while(size>0){
			if(x== spotx[size-1]){
				return true;
			}
			size--;
		}
		return false;
	}
	
	public static int checkEdge(int x, int[] spotx){
		int size = spotx.length;
		while(size>0){
			if(spotx[size-1]==x){
				x--;
			}
			size--;
		}
		
		return x;
	}
	public static void main(String[] args) {
		System.out.println(move(3,3));
		int[] spotx = {1,3};
		int[] spoty = {0,2};
		
		spotmove(3,3,spotx,spoty);
		//System.out.println(checkEdge(3,spotx));
	}

}
