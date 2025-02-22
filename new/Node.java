import java.util.*;
public class Node<X>
{
    X data;
    Node next;
    public static void print(Node node1)
    {
        while(node1!=null)
        {
            System.out.println(node1.data);
            node1=node1.next;
        }
    }
    Node(X data)
    {
        this.data=data;
    }
    public static void main(String args[])
    {
        Node<Integer> node1=new Node<>(10);
        Node<Integer> node2=new Node<>(20);
        Node<Integer> node3=new Node<>(30);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        Node head=node1;
        print(head);
    }
}