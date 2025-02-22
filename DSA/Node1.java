import java.util.*;
public class Node1<X>
{
    X data;
    Node1 next;
    public static void print(Node1 node1)
    {
        while(node1!=null)
        {
            System.out.println(node1.data);
            node1=node1.next;
        }
    }
    Node1(X data)
    {
        this.data=data;
    }
    public static void main(String args[])
    {
        Node1<Integer> node1=new Node1<>(10);
        Node1<Integer> node2=new Node1<>(20);
        Node1<Integer> node3=new Node1<>(30);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        Node1 head=node1;
        print(head);
    }
}