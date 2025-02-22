import java.util.*;
public class in_order
{
    public static void print(Node root, List<Integer> ans)
    {
        if(root==null)
        {
            return;
        }
        print(root.left,ans);
        ans.add(root.data);
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