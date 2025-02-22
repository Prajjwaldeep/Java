import java.util.Stack;

public class Binary_Tree_Practice {
	
	TreeNode root;
	
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
		
		Binary_Tree_Practice tree=new Binary_Tree_Practice();
		
		tree.createBinaryTree(5);
		tree.createBinaryTree(2);
		tree.createBinaryTree(9);
		tree.createBinaryTree(1);
		tree.createBinaryTree(3);
		
		tree.preOrderRecursive(tree.root);
		
	}
	
	public void createBinaryTree(int data)
	{
		
		TreeNode newNode=new TreeNode(data);
		
		if(root==null)
		{
			root=newNode;
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
					if(current == null)
					{
						parent.left=newNode;
						return;
					}
				}
				else
				{
					current=current.right;
					if(current == null)
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
		else
		{
			System.out.println(root.data);
			preOrderRecursive(root.left);
			preOrderRecursive(root.right);
		}
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
	
}
