package edu.java.chap4;
//given a directed graph, design an algorithm to find out whether there is a route between two nodes.
/*
 * directed graph: 
 */
public class DirectPath {
	
	public static boolean CheckReach(int from, int to, int[][] vertice){
		
		
		return false;
	}
	
	public static void main(String[] args) {
		// build graph
		Node n1 = new Node(1);
		Node n2 = new Node(3);
		Node n3 = new Node(7);
		Node n4 = new Node(4);
		Node n5 = new Node(9);
		
		int[][] vertice = {{1,2},{2,1},{1,5},{2,3},{2,4},{5,4}};
		
		//check reach
	}

}

class Node{
	Object data;
	Node to = null;
	Node from = null;
	Node(Object data){
		this.data = data;
	}
}