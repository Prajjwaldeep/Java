import java.util.*;
public class LinkedList_8_Reverse_Recursive
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
    public static Node<Integer> reverse(Node<Integer> head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> finalhead=reverse(head.next);
        Node<Integer> temp=finalhead;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        return finalhead;
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
        head=reverse(head);
        print(head);
    }
}