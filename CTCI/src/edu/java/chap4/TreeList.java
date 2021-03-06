package edu.java.chap4;

import java.util.LinkedList;

public class TreeList {

	/*
	 * given a binary tree, design an algorithm which creates a linked list of all the 
	 * nodes at each depth, (e.g., if you have a tree with depth d you will have d linked lists)
	 */
	
	//time complex: O(n), space complex: O(n), BFS based
	public static void list(TreeNode root){
		LinkedList<LinkedList<TreeNode>> list = new LinkedList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> temp = new LinkedList<TreeNode>();
		if(root == null) return;
		temp.add(root);
		list.add(temp);
		int k=0;
		while(list.get(k)!=null &&list.get(k).size()>0){
			LinkedList<TreeNode> temp2 = new LinkedList<TreeNode>();
			for(int i = 0; i<list.get(k).size();i++){
				if(list.get(k).get(i).left !=null){
					temp2.add(list.get(k).get(i).left);
				}
				if(list.get(k).get(i).right !=null){
					temp2.add(list.get(k).get(i).right);
				}
			}
			list.add(temp2);
			k++;
		}
		
		for(int i =0;i<list.size();i++){
			for(int j = 0;j<list.get(i).size();j++){
				System.out.print(list.get(i).get(j).data+" ");
			}
			System.out.println();
		}

	}
	//time: O(logn) space: O(n), DFS based
	public static void list2(TreeNode root){
		LinkedList<LinkedList<TreeNode>> lists = new LinkedList<LinkedList<TreeNode>>();
		create(root, lists,0);
		
		for(int i =0;i<lists.size();i++){
			for(int j = 0;j<lists.get(i).size();j++){
				System.out.print(lists.get(i).get(j).data+" ");
			}
			System.out.println();
		}
	}
	
	public static void create(TreeNode root,LinkedList<LinkedList<TreeNode>> lists, int level){
		if (root == null) return;
		
		LinkedList<TreeNode> list = null;
		if(lists.size() == level){
			list = new LinkedList<TreeNode> ();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		create(root.left, lists, level+1);
		create(root.right, lists, level+1);
	}
	
	public static void main(String[] args) {
		TreeNode tn = new TreeNode(5);
		tn.left = new TreeNode(3);
		tn.left.left = new TreeNode(2);
		tn.left.right = new TreeNode(4);
		tn.left.left.left = new TreeNode(1);
		tn.right = new TreeNode(8);
		tn.right.left = new TreeNode(6);
		tn.right.right = new TreeNode(9);
		tn.right.right.right = new TreeNode(11);
		
		//TreeNode tn1 = new TreeNode(5);
		list(tn);
		list2(tn);
	}

}
