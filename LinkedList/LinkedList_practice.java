import java.util.*;
public class LinkedList_practice
{
    public static Node<Integer> takeInput()
    {
        Scanner in=new Scanner(System.in);
        int data;
        Node<Integer> head=null;
        System.out.println("Enter the numbers : ");
        data=in.nextInt();
        while(data!=-1)
        {
            Node<Integer> newNode = new Node<>(data);
            if(head==null)
            {
                head=newNode;
            }
            else
            {
                Node<Integer> temp=head;
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
        Scanner in=new Scanner(System.in);
        Node<Integer> input=takeInput();
        print(input);
    }
}