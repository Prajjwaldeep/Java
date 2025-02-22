
public class CircularLinkedList {
	
	ListNode head;
	ListNode tail;
	
	public class ListNode
	{
		int data;
		ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
		}
		
	}
	
	public CircularLinkedList()
	{
		head=null;
		tail=null;
	}
	
	public static void main(String[] args) {
		
		CircularLinkedList cll= new CircularLinkedList();
		cll.createCircularLinkedList(2);
		cll.createCircularLinkedList(5);
		cll.createCircularLinkedList(7);
		
		cll.insertAtBeginning(10);
		
		//cll.insertAtEnd(20);
		
		//cll.insertDataAtPos(6, 5);
		
		//cll.deleteFromBeginning();
		
		cll.deleteFromEnd();
		
		//cll.deleteDataAtPos(3);
		
		System.out.println("No. of nodes: "+cll.countNodes());
		
		cll.displayList();
		
		
	}
	
	public void createCircularLinkedList(int data)
	{
		
		ListNode newNode=new ListNode(data);
		
		if(head==null)
		{
			tail=head=newNode;
			newNode.next=head;
		}
		else
		{
			
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
		
		
	}
	
	public void insertAtBeginning(int data)
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			head=tail=newNode;
			newNode.next=head;
		}
		else
		{
			newNode.next=head;
			head=newNode;
			tail.next=head;
		}
	}
	
	public void insertAtEnd(int data)
	{
		ListNode newNode=new ListNode(data);
		if(tail==null)
		{
			head=tail=newNode;
			newNode.next=head;
		}
		else
		{
			
			tail.next=newNode;
			tail=newNode;
			newNode.next=head;
			
		}
		
	}
	
	public void insertDataAtPos(int data,int pos)
	{
		
		if(pos==1)
		{
			insertAtBeginning(data);
		}
		else if(pos==countNodes()+1)
		{
			insertAtEnd(data);
		}
		else
		{
			if(pos>0 && pos<=countNodes())
			{
				ListNode newNode=new ListNode(data);
				ListNode temp=head;
				ListNode nextNode;
				for(int i=1;i<pos-1;i++)
				{
					temp=temp.next;
				}
				nextNode=temp.next;
				
				newNode.next=nextNode;
				temp.next=newNode;
			}
			
		}
		
	}
	
	public void deleteFromBeginning()
	{
		if(head==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			if(head!=tail)
			{
				System.out.println(head.data+" is deleted!");
				head=head.next;
				tail.next=head;
			}
			else
			{
				head=tail=null;
			}
		}
	}
	
	public void deleteFromEnd()
	{
		
		if(head==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			if(head!=tail)
			{
				
				ListNode temp=head;
				while(temp.next!=tail)
				{
					temp=temp.next;
				}
				tail=temp;
				tail.next=head;
				
			}
			else
			{
				head=tail=null;
			}
		}
		
	}
	
	public void deleteDataAtPos(int pos)
	{
		
		if(pos==1)
		{
			deleteFromBeginning();
		}
		else if(pos==(countNodes()+1))
		{
			deleteFromEnd();
		}
		else
		{
			if(pos>1 && pos<=countNodes())
			{
				ListNode temp=head;
				ListNode nextNode;
				for(int i=1;i<pos-1;i++)
				{
					temp=temp.next;
				}
				nextNode=temp.next.next;
				temp.next=nextNode;
				
			}
		}
		
	}
	
	public int countNodes()
	{
		
		ListNode temp=tail.next;
		int count=0;
		while(temp!=tail)
		{
			count++;
			temp=temp.next;
		}
		return (count+1);
	}
	
	public void displayList()
	{
		
		if(head==null)
		{
			System.out.println("No Element");
		}
		else
		{
			ListNode temp=tail.next;
			while(temp!=tail)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
				
		}
		
	}

}
