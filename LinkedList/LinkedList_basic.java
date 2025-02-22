import java.util.*;
public class LinkedList_basic
{
    static Node<Integer> head=null;
    static Node<Integer> tail=null;
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int data;
        System.out.println("Data : ");
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
        while(tail!=null)
        {
            System.out.print(tail.data+" ");
            tail=tail.prev;
        }
    }
}
