package module.datastruct;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode{
	
	int data;
	BinaryTreeNode left = null;
	BinaryTreeNode right = null;
	
	BinaryTreeNode(int d){
		this.data = d;
	}
	
	int getData(){
		return(data);
	}
	
	void visit(){
		System.out.println(this.getData());
	}	
	
}

public class MyBinaryTree {
	
	void insert(BinaryTreeNode tree, int data){
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(tree);
		BinaryTreeNode d = new BinaryTreeNode(data);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if(temp.left == null){
				temp.left = d;
				return;
			} else if(temp.right == null){
				temp.right = d;
				return;
			} else{
				q.add(temp.left);
				q.add(temp.right);
			}
		}
	}
	
	void inorder(BinaryTreeNode current){
		if(current != null){
			inorder(current.left);
			current.visit();
			inorder(current.right);
		}
	}
	
	void preorder(BinaryTreeNode current){
		if(current != null){
			current.visit();
			preorder(current.left);
			preorder(current.right);		
		}
	}
	
	void postorder(BinaryTreeNode current){
		if(current != null){
			postorder(current.left);
			postorder(current.right);
			current.visit();
		}
	}
	
	BinaryTreeNode createBinaryTree(int[] arr){
		BinaryTreeNode root = new BinaryTreeNode(arr[0]);
		for(int i = 1;i <arr.length; i++){
			insert(root, arr[i]);
		}
		return root;
	}

}
