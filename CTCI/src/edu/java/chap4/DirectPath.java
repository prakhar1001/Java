package edu.java.chap4;

import java.util.LinkedList;

//given a directed graph, design an algorithm to find out whether there is a route between two nodes.
/*
 */
public class DirectPath {
	
	//public static void DFS(Node root){
		
	//}
	
	public static boolean CheckReach(int from, int to, int[][] vertice){
		if(from == to) return true;
		
		LinkedList<Integer> list = new LinkedList<Integer> ();
		list.add(from);
		int pos = 0;
		while(list.size()>pos){
			from = list.get(pos);
			for(int i = 0; i<vertice.length;i++){
				if(vertice[i][0] == from &&!check(list,vertice[i][1])){
					list.add(vertice[i][1]);
				}
			}
			if(check(list,to)){
				return true;
			}
			pos++;
		}
		return false;
	}
	
	public static boolean check(LinkedList<Integer> list, int data){
		for(int i = 0; i<list.size();i++){
			if(list.get(i) ==data){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// build graph
		/*Node n1 = new Node(1);
		Node n2 = new Node(3);
		Node n3 = new Node(7);
		Node n4 = new Node(4);
		Node n5 = new Node(9);
		*/
		
		int[][] vertice = {{1,2},{2,1},{1,5},{3,2},{2,4},{5,4}};
		for(int i = 1; i<6;i++){
			System.out.println(CheckReach(1,i,vertice));
		}
		//check reach
	}

}

/*
class Node{
	Object data;
	Node to = null;
	Node from = null;
	Node(Object data){
		this.data = data;
	}
}*/