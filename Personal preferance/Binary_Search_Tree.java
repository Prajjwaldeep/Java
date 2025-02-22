import java.util.HashSet;
import java.util.Set;

public class Binary_Search_Tree {
	
	TreeNode root;
	
	Set<String> set=new HashSet<>();
	
	public class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data)
		{
			this.data=data;
		}
		
	}
	
	public static void main(String[] args) {
		
		Binary_Search_Tree bst=new Binary_Search_Tree();
		
		bst.insert(5);
		bst.insert(2);
		bst.insert(9);
		bst.insert(1);
		bst.insert(3);
		
		System.out.println("IN-ORDER:");
		bst.inOrderTraversal(bst.root);
		
//		if(bst.searchKey(3)!=null)
//		{
//			System.out.println("Data Found!");
//			bst.set.forEach(System.out::println);
//		}
//		else
//		{
//			System.out.println("Data Not Found!");
//		}
		
	}
	
	public void insert(int value)
	{
		root=insert(root,value);
	}
	
	public TreeNode insert(TreeNode root,int value)
	{
		
		TreeNode newNode=new TreeNode(value);
		if(root==null)
		{
			root=newNode;
			return root;
		}
		else
		{
			if(value < root.data)
			{		
				root.left= insert(root.left,value);
			}
			else
			{	
				root.right=insert(root.right,value);
			}
			return root;
		}
	}
	
//	public void inOrderTraversal()
//	{
//		inOrderTraversal(root);
//	}
	
	public void inOrderTraversal(TreeNode root)
	{
		
		if(root==null)
		{
			return;
		}
		else
		{
			inOrderTraversal(root.left);
			System.out.println(root.data);
			inOrderTraversal(root.right);
		}
		
	}
	
	public TreeNode searchKey(int key)
	{
		return searchKey(root,key);
	}
	
	public TreeNode searchKey(TreeNode root,int key)
	{
		
		if(root==null || root.data==key)
		{
			return root;
		}
		else
		{
			String s;
			if(key < root.data)
			{
				s="Left of "+root.data;
				set.add(s);
				return searchKey(root.left,key);
			}
			else
			{
				s="Right of "+root.data;
				set.add(s);
				return searchKey(root.right,key);
			}
		}
	}

}
