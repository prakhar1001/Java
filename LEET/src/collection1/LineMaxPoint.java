package collection1;


/*
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 */
public class LineMaxPoint {

	public int maxPoints(Point[] points) {
        int[][] result = Matrix(points);
        return findRow(Matrix(points));
        
    }

	public int[][] Matrix(Point[] points){
		int max = 0;
		for(int i =0;i<points.length;i++){
			if(points[i].x > max){
				max = points[i].x;
			} 
			if(points[i].y >max) {
				max = points[i].y;
			}
		}
		int[][] result = new int[max+1][max+1];
		System.out.println(max);
		for(int i =0;i<points.length;i++){
			result[points[i].x][points[i].y] = 1;
		}
		return result;
		
	}
	
	public int findRow(int[][] matrix) {
		int max = 0;
		for(int i =0;i<matrix.length;i++){
			int temp = 0;
			for(int j =0; j<matrix.length;j++){
				temp+=matrix[i][j];
			}
			if(temp>max){
				max = temp;
			}
		}
		
		for(int i =0;i<matrix.length;i++){
			int temp = 0;
			for(int j =0; j<matrix.length;j++){
				temp+=matrix[j][i];
			}
			if(temp>max){
				max = temp;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		LineMaxPoint lmp = new LineMaxPoint();
		Point p1 = new Point(1,0);
		Point p2 =new Point(0,0);
		Point[] p = {p1,p2};
		System.out.println(lmp.maxPoints(p));
	}

}

class Point {
	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int a, int b) {
		x = a;
		y = b;
	}
}