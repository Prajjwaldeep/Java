import java.util.*;
public class Stack_LL
{
    static Node head;
    static int size=0;
    public static boolean isEmpty()
    {
        return head==null;
    }
    public static void push(int data)
    {
        Node newNode=new Node(data);
        if(isEmpty())
        {
            head=newNode;
            size++;
        }
        else
        {
            newNode.next=head;
            head=newNode;
            size++;
        }
    }
    public static int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            size--;
            int top=head.data;
            head=head.next;
            return top;
        }
    }
    public static int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            return head.data;
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Shoot the stack elements : ");
        int data=in.nextInt();
        Stack_LL ob=new Stack_LL();
        while(data!=-1)
        {
            ob.push(data);
            data=in.nextInt();
        }
        System.out.println("Stack Elements : ");
        while(!isEmpty())
        {
            System.out.print(ob.peek()+" ");
            ob.pop();
        }
        System.out.print("\nSize of stack : "+size);
    }
}