import java.util.*;
public class LinkedList_palin
{
        static Node<Integer> head=null;
        static Node<Integer> tail=null;
    public static Node<Integer> takeInput()
    {
        
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
                Node<Integer> n=tail;
                tail.next=newNode;
                tail=tail.next;
                tail.prev=n;
            }
            data=in.nextInt();
        }
        return head;
    }
    public static boolean palin(Node<Integer> head)
    {
        Node<Integer> temp1,temp2;
        temp1=head;
        temp2=tail;
        while(temp1!=null)
        {
            if(temp1.data!=temp2.data)
            {
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.prev;
        }
        return true;
    }
    public static void main(String args[])
    {
        Node<Integer> head=takeInput();
        boolean x=palin(head);
        System.out.println(x);
    }
}