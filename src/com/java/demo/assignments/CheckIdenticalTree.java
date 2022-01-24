package com.java.demo.assignments;

public class CheckIdenticalTree {

	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public Node root;

	public CheckIdenticalTree() {
		root = null;
	}

	public static boolean areIdenticalTrees(Node root1, Node root2) {
		
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null && root2 == null)
			return true;

		if (root1 != null && root2 != null) {

			return ((root1.data == root2.data) && (areIdenticalTrees(root1.left, root2.left)) && (areIdenticalTrees(root1.right, root2.right)));
		}
		return false;
	}

	public static void main(String[] args) {
		
		//Identical Nodes Input Data
		CheckIdenticalTree firstTree = new CheckIdenticalTree();
		
		int firstTreeRootNode = 9;
		int firstTreeLeftNode = 3;
		int firstTreeRightNode = 6;	
		
		firstTree.root = new Node(firstTreeRootNode);
		firstTree.root.left = new Node(firstTreeLeftNode);
		firstTree.root.right = new Node(firstTreeRightNode);		
		
		CheckIdenticalTree secondTree = new CheckIdenticalTree();
		
		int secondTreeRootNode = 9;
		int secondTreeLeftNode = 3;
		int secondTreeRightNode = 6;	
		
		secondTree.root = new Node(secondTreeRootNode);
		secondTree.root.left = new Node(secondTreeLeftNode);
		secondTree.root.right = new Node(secondTreeRightNode);
		
		// UnIdentical Nodes Input Data
//		CheckIdenticalTree firstTree = new CheckIdenticalTree();
//
//		int firstTreeRootNode = 9;
//		int firstTreeLeftNode = 3;
//		int firstTreeRightNode = 2;
//
//		firstTree.root = new Node(firstTreeRootNode);
//		firstTree.root.left = new Node(firstTreeLeftNode);
//		firstTree.root.right = new Node(firstTreeRightNode);
//
//		CheckIdenticalTree secondTree = new CheckIdenticalTree();
//
//		int secondTreeRootNode = 10;
//		int secondTreeLeftNode = 3;
//		int secondTreeRightNode = 6;
//
//		secondTree.root = new Node(secondTreeRootNode);
//		secondTree.root.left = new Node(secondTreeLeftNode);
//		secondTree.root.right = new Node(secondTreeRightNode);

		if (areIdenticalTrees(firstTree.root, secondTree.root)) {
			System.out.println("Both the binary trees are identical");
		}
		else {
			System.out.println("Both the binary trees are not identical");
		}
	}
}
