import java.util.*;
public class TreeUse
{
    public static TreeNode<Integer> takeInput(Scanner in)
    {
        int n;
        System.out.println("Enter the next-node data :");
        n=in.nextInt();
        TreeNode<Integer> root=new TreeNode<Integer>(n);
        System.out.println("Enter the number of children for "+n);
        int childCount=in.nextInt();
        for(int i=0; i<childCount; i++)
        {
            TreeNode<Integer> child=takeInput(in);
            root.children.add(child);
        }
        return root;
    }
    public static void print(TreeNode<Integer> root)
    {
        String s=root.data+":";
        for(int i=0; i<root.children.size(); i++)
        {
            s=s+root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0; i<root.children.size(); i++)
        {
            print(root.children.get(i));
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        TreeNode<Integer> root=takeInput(in);
        print(root);
    }
}