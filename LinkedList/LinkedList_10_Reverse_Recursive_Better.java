import java.util.*;
public class LinkedList_10_Reverse_Recursive_Better
{
    public static Node<Integer> takeInput()
    {
        Node<Integer> head=null;
        Node<Integer> tail=null;
        Scanner in=new Scanner(System.in);
        int data;
        System.out.println("Enter elements of linked_list :");
        data=in.nextInt();
        while(data!=-1)
        {
            Node<Integer> newNode=new Node<>(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=tail.next;
            }
            data=in.nextInt();
        }
        return head;
    }
    public static DoubleNode reverse(Node<Integer> head)
    {
        if(head==null || head.next==null)
        {
            DoubleNode ans=new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;
        }
        DoubleNode smallAns=reverse(head.next);
        smallAns.tail.next=head;
        head.next=null;
        
        DoubleNode ans=new DoubleNode();
        ans.head=smallAns.head;
        ans.tail=head;
        return ans;
    }
    public static void print(Node<Integer> head)
    {
        Node<Integer> temp=head;
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Node<Integer> head=takeInput();
        DoubleNode ans=reverse(head);
        print(ans.head);
    }
}