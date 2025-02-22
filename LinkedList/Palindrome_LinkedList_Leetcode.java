import java.util.*;
class Palindrome_LinkedList_Leetcode {
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
    public static Node<Integer> midpoint(Node<Integer> head)
    {
        Node<Integer> slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node<Integer> reverse(Node<Integer> head)
    {
        Node<Integer> prev=null,curr=head, next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static boolean isPalindrome(Node<Integer> head) {
        if(head==null || head.next==null)
        {
            return true;
        }
        Node<Integer> mid=midpoint(head);
        mid.next=reverse(mid.next);
        mid=mid.next;
        while(mid!=null)
        {
            if(head.data!=mid.data)
            {
                return false;
            }
            head=head.next;
            mid=mid.next;
        }
        return true;
    }
    public static void main(String args[])
    {
        Node<Integer> head=takeInput();
        boolean x=isPalindrome(head);
        System.out.println(x);
    }
}