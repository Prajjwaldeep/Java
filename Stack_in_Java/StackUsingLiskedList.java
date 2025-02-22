public class StackUsingLiskedList
{
    static Node head;
    public static boolean isEmpty()
    {
        return head==null;
    }
    public static void push(int data)
    {
        Node newNode=new Node(data);
        if(isEmpty()==true)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
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
        StackUsingLiskedList s=new StackUsingLiskedList();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}