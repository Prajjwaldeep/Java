import java.util.*;
public class pre_order
{
    public static void print(Node root, List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        ans.add(root.data);
        print(root.left,ans);
        print(root.right,ans);
    }
    public static List<Integer> preorderTraversal(Node root) {
        List<Integer> ans=new ArrayList<>();
        print(root,ans);
        return ans;
    }
    public static void main(String args[])
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);
        List<Integer> elements=preorderTraversal(root);
        System.out.println(elements);
    }
}