import java.util.*;
public class LinkedList_7
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
    public static Node<Integer> delete(Node<Integer> head, int pos)
    {
        if(pos==0)
        {
            head=head.next;
            return head;
        }
        Node<Integer> temp=head;
        int i=0;
        while(temp.next!=null && i<pos-1)
        {
            temp=temp.next;
            i++;
        }
        if(temp.next!=null)
        {
            temp.next=temp.next.next;
        }
        return head;
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
        head=delete(head,0);
        print(head);
    }
}