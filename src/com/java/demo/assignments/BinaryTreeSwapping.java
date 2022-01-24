package com.java.demo.assignments;

public class BinaryTreeSwapping {

	static int res;
	static int multOfLeaf = 1;
	public static void main(String[] args) {
		Node root = newNode(9);
	    root.left = newNode(6);
	    root.right = newNode(3);
	    root.right.left = newNode(2);
	    root.right.right = newNode(7);
	    root.right.left.left = newNode(3);
	    root.right.left.right = newNode(5);
	 
	    int binaryLevel =2;
	    System.out.println("Before swap node :");
	    inorder(root);
	 
	    swapEveryKLevel(root, binaryLevel);	 
	    System.out.println("\nAfter swap Node :" );
	    inorder(root);
	    
	    System.out.println("\nSum of All child Nodes : "+sumOfAllChildNodes(root));
	    multiplicationOfLeafs(root);
	    System.out.println("Multiplication of Only child Nodes : "+multOfLeaf);
	}

	static class Node
	{
	    int data;
	    Node left, right;
	};
	
	static Node newNode(int data)
	{
	    Node temp = new Node();
	    temp.data = data;
	    temp.left = temp.right = null;
	    return temp;
	}
	
	static void swapEveryKLevelUtil( Node root, int level, int k)
	{
		if (root == null || (root.left == null && root.right == null))
			return;
		if ((level + 1) % k == 0) {
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
		swapEveryKLevelUtil(root.left, level + 1, k);
		swapEveryKLevelUtil(root.right, level + 1, k);
	}
	
	static void swapEveryKLevel(Node root, int k)
	{
	    swapEveryKLevelUtil(root, 1, k);
	}
	 
	static void inorder(Node root)
	{
	    if (root == null)
	        return;
	    inorder(root.left);
	    System.out.print(root.data + " ");
	    inorder(root.right);
	}
	
	static void calcSum(Node root) {
		if (root == null)
			return;
		if (root.left != null)
			res += root.left.data;

		if (root.right != null)
			res += root.right.data;
		calcSum(root.left);
		calcSum(root.right);
	}
	 
	private static int sumOfAllChildNodes(Node root)
	{
	    res = 0;	 
	    calcSum(root);
	    return res;
	}	
	
	private static void  multiplicationOfLeafs(Node root) {
		if (root == null)
            return;
        if (root.left == null && root.right == null)
        	multOfLeaf = multOfLeaf*root.data;
     
        multiplicationOfLeafs(root.left);
        multiplicationOfLeafs(root.right);
	}
}
