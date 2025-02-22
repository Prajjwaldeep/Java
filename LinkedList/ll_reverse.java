import java.util.*;
public class ll_reverse
{
    public static Node<Integer> takeInput()
    {
        Scanner in=new Scanner(System.in);
        Node<Integer> head=null,tail=null;
        int data;
        System.out.println("Enter values : ");
        data=in.nextInt();
        while(data!=-1)
        {
            Node<Integer> newNode=new Node<>(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            tail.next=newNode;
            tail=tail.next;
            data=in.nextInt();
        }
        return head;
    }
    public static Node<Integer> reverse(Node<Integer> head)
    {
        Node<Integer> prev=null,curr=head,next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void print(Node<Integer> head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String args[])
    {
        Node<Integer> head=takeInput();
        Node<Integer> sidechange=reverse(head);
        print(sidechange);
    }
}