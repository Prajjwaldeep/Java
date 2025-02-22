import java.util.Collections;
import java.util.*;

public class DoublyLinkedList {

	ListNode head;
	ListNode tail;
	int length;
	
	public class ListNode
	{
		int data;
		ListNode next;
		ListNode prev;
		
		public ListNode(int data)
		{
			this.data=data;
		}
		
	}
	
	public DoublyLinkedList()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public int length()
	{
		return length;
	}
	
	public static void main(String args[])
	{
		
		int count;
		
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.addNodes(5);
		dll.addNodes(2);
		dll.addNodes(7);
		dll.addNodes(9);

		//dll.insertAtBeginning(10);
		
		//dll.insertAtEnd(20);
		
		//dll.insertAtPos(15, 6);
		
		dll.deleteFromBeginning();
		
		//dll.deleteFromEnd();
		
		//dll.deleteAtPos(4);
		
		count=dll.countNodes();
		
		System.out.println("COUNT: "+count);
		
		System.out.println("FORWARD------------------");
		dll.printNodes();
		
		System.out.println("BACKWARD------------------");
		dll.printNodesBackward();
		
//		System.out.println("SORTED------------------");
//		dll.sortNodes();
		
	}
	
	public void sortNodes()
	{
		
		List<Integer> list=new ArrayList<>();
		
		ListNode temp=head;
		while(temp!=null)
		{
			list.add(temp.data);
			temp=temp.next;
		}
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
		
	}
	
	public void addNodes(int data)
	{
		ListNode newNode=new ListNode(data);
		
		if(head==null)
		{
			head=tail=newNode;
		}
		else
		{
			
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
			tail.next=null;
		}
		
	}
	
	public void insertAtBeginning(int data)
	{
		ListNode newNode=new ListNode(data);
		
		if(head==null)
		{
			head=tail=newNode;
		}
		else
		{
			
			head.prev=newNode;
			newNode.next=head;
			newNode.prev=null;
			head=newNode;
		}
		
	}
	
	public void insertAtEnd(int data)
	{
		ListNode newNode=new ListNode(data);
		
		if(head==null)
		{
			head=tail=newNode;
		}
		else
		{
			
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
			newNode.next=null;
			
		}
		
	}
	
	public void insertAtPos(int data,int pos)
	{
		ListNode newNode=new ListNode(data);
		
		ListNode temp=head;
		ListNode nextNode=head;
		
		int count=countNodes();
		
		if(pos==1)
		{
			insertAtBeginning(data);
		}
		else if(pos==(count+1))
		{
			insertAtEnd(data);
		}
		else
		{
			if(pos>0 && pos<=count)
			{
				for(int i=1;i<pos-1;i++)
				{
					temp=temp.next;
				}
				nextNode=temp.next;
				nextNode.prev=newNode;
				newNode.next=nextNode;
				temp.next=newNode;
				newNode.prev=temp;
			}
		}
		
	}
	
	public void deleteFromBeginning()
	{
		if(head==null)
		{
			return;
		}
		else
		{
			if(head!=tail)
			{
				ListNode temp=head;
				head=head.next;
				temp.next=null;
				head.prev=null;
			}
			else
			{
				head=tail=null;
			}
		}
		
	}
	
	public void deleteFromEnd()
	{
		
		if(tail==null)
		{
			return;
		}
		else
		{
			if(tail!=head)
			{
				
				ListNode temp=tail;
				tail=tail.prev;
				temp.prev=null;
				tail.next=null;
				
			}
			else
			{
				tail=head=null;
			}
		}
		
	}
	
	public void deleteAtPos(int pos)
	{
		int count=countNodes();
		
		if(pos==1)
		{
			deleteFromBeginning();
		}
		else if(pos==count)
		{
			deleteFromEnd();
		}
		else
		{
			if(pos>0 && pos<count)
			{
				ListNode temp=head;
				ListNode nextNode,delNode;
				
				for(int i=1;i<pos-1;i++)
				{
					temp=temp.next;
				}
				delNode=temp.next;
				nextNode=temp.next.next;
				temp.next=nextNode;
				nextNode.prev=temp;
				delNode.prev=null;
				delNode.next=null;
			}
			
		}
		
	}
	
	public int countNodes()
	{
		
		ListNode temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public void printNodes()
	{
		
		ListNode temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	public void printNodesBackward()
	{
		
		ListNode temp=tail;
		while(temp!=null)
		{
			
			System.out.println(temp.data);
			temp=temp.prev;
			
		}
		
	}
	
}
