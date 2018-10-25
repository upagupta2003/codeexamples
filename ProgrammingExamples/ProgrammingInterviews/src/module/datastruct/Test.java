package module.datastruct;

public class Test {
	
	static int indexEqualsValueSearch(int[] arr) {
	   
		for(int i=0;i<arr.length; i++){
	      if(arr[i] == i){
	        return(i);
	      }
	    }
		return(-1);
	  }
	
	public static void main(String[] args){
		
		MyBinaryTree a = new MyBinaryTree();
		int[] arr = {10,20,30,40,50,60,71,80,90,91};
		BinaryTreeNode root = a.createBinaryTree(arr);
		a.preorder(root);
		
	}

}
