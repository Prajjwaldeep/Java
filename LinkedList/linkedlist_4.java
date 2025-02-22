import java.util.*;
public class linkedlist_4
{
    public static Node<Integer> takeInput()
    {
        Scanner in=new Scanner(System.in);
        Node<Integer> head=null;
        int data;
        System.out.println("Enter elements of linked_list :");
        data=in.nextInt();
        while(data!=-1)
        {
            Node<Integer> newNode= new Node<>(data);
            if(head==null)
            {
                head=newNode;
            }
            else
            {
                Node<Integer>temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            data=in.nextInt();
        }
        return head;
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
        Node<Integer>head=takeInput();
        print(head);
    }
}