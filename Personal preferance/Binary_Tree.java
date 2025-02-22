import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Binary_Tree {
	
	TreeNode root;
	
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	
	public class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data)
		{
			this.data=data;
		}	
	}
	
	public static void main(String[] args) {
		
		Binary_Tree tree=new Binary_Tree();
		
		//tree.createBinaryTree();
		tree.createBinaryTree(5);
		tree.createBinaryTree(2);
		tree.createBinaryTree(9);
		tree.createBinaryTree(1);
		tree.createBinaryTree(3);
		
		//System.out.println("MIN: "+tree.min);
		//System.out.println("MAX: "+tree.max);
		
		//System.out.println("PRE-ORDER REC:");
		//tree.preOrderRecursive(tree.root);
		
		System.out.println("PRE-ORDER ITER:");
		tree.preOrderIterative();
		
		//System.out.println("IN-ORDER REC:");
		//tree.inOrderRecursive(tree.root);// WILL GIVE IN ASCENDING ORDER
		
		System.out.println("IN-ORDER ITER:");
		tree.inOrderIterative();
		
		//System.out.println("POST-ORDER REC:");
		//tree.postOrderRecursive(tree.root);
		
		System.out.println("POST-ORDER ITER:");
		tree.postOrderIterative();
		
		System.out.println("LEVEL ORDER TRAVERSAL:");
		tree.levelOrderTraversal();
		
//		ArrayList<Object> list=new ArrayList<>();
//		list.add("Anupam");
//		list.add(1);
//		list.add(5.2);
//		
//		list.forEach(System.out::println);
		
		
	}
	
//	public void createBinaryTree()
//	{
//		
//		TreeNode first=new TreeNode(9);
//		TreeNode second=new TreeNode(2);
//		TreeNode third=new TreeNode(3);
//		TreeNode fourth=new TreeNode(4);
//		//TreeNode fifth=new TreeNode(5);
//		
//		/*	
//		 * 		1
//		 *     / \
//		 *    2   3
//		 *   / \
//		 *  4   5
//		 *  
//		 */
//		
//		root=first;
//		
//		first.left=second;
//		first.right=third;
//		
//		second.left=fourth;
//		//second.right=fifth;
//		
//	}
	
	public void createBinaryTree(int data)
	{
		if(data < min)
		{
			min=data;
		}
		if(data > max)
		{
			max=data;
		}
		
		TreeNode newNode=new TreeNode(data);
		if(root==null)
		{
			root=newNode;
			return;
		}
		else
		{
			
			TreeNode current=root;
			TreeNode parent=null;
			
			while(true)
			{
				parent=current;
				
				if(data < current.data)
				{
					current=current.left;
					if(current==null)
					{
						parent.left=newNode;
						return;
					}
				}
				
				else
				{		
					current=current.right;
					if(current==null)
					{
						parent.right=newNode;
						return;
					}	
				}
			}
		}
	}
	
	public void preOrderRecursive(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.data+" ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);
	}
	
	public void preOrderIterative()
	{
		if(root==null)
		{
			return;
		}
		else
		{
			Stack<TreeNode> stack=new Stack<>();
			stack.push(root);
			while(!stack.isEmpty())
			{
				
				TreeNode temp=stack.pop();
				System.out.println(temp.data);
				if(temp.right!=null)
				{
					stack.push(temp.right);
				}
				if(temp.left!=null)
				{
					stack.push(temp.left);
				}
			}
		}
	}
	
	public void inOrderRecursive(TreeNode root)
	{
		
		if(root==null)
		{
			return;
		}
		else
		{
			inOrderRecursive(root.left);
			System.out.println(root.data);
			inOrderRecursive(root.right);
		}
		
	}
	
	public void inOrderIterative()
	{
		
		  if(root==null)
		  {
			  return;
		  }
		  else
		  {
			  
			  Stack<TreeNode> stack=new Stack<>();
			  TreeNode temp=root;
			  while(!stack.isEmpty() || temp!=null)
			  {
				  if(temp!=null)
				  {
					  stack.push(temp); 
					  temp=temp.left;
				  }
				  else
				  {
					  temp=stack.pop();
					  System.out.println(temp.data);
					  temp=temp.right;
				  }
			  }
			  
		  }
		
	}
	
	public void postOrderRecursive(TreeNode root)
	{
		
		if(root==null)
		{
			return;
		}
		else
		{
			postOrderRecursive(root.left);
			postOrderRecursive(root.right);
			System.out.println(root.data);
		}
	}
	
	public void postOrderIterative()
	{	
		TreeNode current=root;
		Stack<TreeNode> stack=new Stack<>();
		while(current!=null || !stack.isEmpty())
		{
			if(current!=null)
			{
				stack.push(current);
				current=current.left;
			}
			else
			{
				TreeNode temp=stack.peek().right;
				if(temp==null)
				{
					temp=stack.pop();
					System.out.println(temp.data);
					
					while(!stack.isEmpty() && temp==stack.peek().right)
					{
						temp=stack.pop();
						System.out.println(temp.data);
					}
				}
				else
				{
					current=temp;
				}
			}
		}
		
	}
	
	public void levelOrderTraversal()
	{
		
		if(root==null)
		{
			return;
		}
		else
		{
			
			Queue<TreeNode> queue=new LinkedList<>();
			
			queue.offer(root);
			while(!queue.isEmpty())
			{
				
				TreeNode temp=queue.poll();
				System.out.println(temp.data);
				
				if(temp.left!=null)
				{
					queue.offer(temp.left);
				}
				if(temp.right!=null)
				{
					queue.offer(temp.right);
				}
				
			}
			
		}
		
	}
}