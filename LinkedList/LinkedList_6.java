import java.util.*;
public class LinkedList_6
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
    public static Node<Integer> insert(Node<Integer> head, int pos, int data)
    {
        Node<Integer> newNode=new Node<>(data);
        if(pos==0)
        {
            newNode.next=head;
            return newNode;
        }
        int i=0;
        Node<Integer> temp=head;
        while(i<pos-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
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
        head=insert(head,2,80);
        print(head);
    }
}