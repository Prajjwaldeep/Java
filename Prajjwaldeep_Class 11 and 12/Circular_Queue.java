/**
 * A program to describe and implement Circular queue operation
 */
import java.util.*;
public class Circular_Queue
{
    int q[];//array to hold queue elements
    int f;//front pointer 
    int r;//rear pointer
    int size;//array(queue) size
    Circular_Queue(int n)
    {
        //parametrized constructor to initialize data members
        f=-1;
        r=-1;
        q=new int[n];//initialising array
        size=n;
    }
    /*Method to insert queue element*/
    void insertqueue(int item)
    {
        if(f==0&&r==size-1||f==r+1)
        System.out.println("Queue overflows!!Can not insert");
        else
        {
            if(f==-1&&r==-1)
            {
                f=0;
                r=0;
            }
            else
            {
                if(r==size-1)
                {
                    r=0;
                }
                else
                {
                    r=r+1;
                }
                q[r]=item;
            }
        }
    }
    /*Method to delete queue element*/
    void deletequeue()
    {
        int val;
        if(f==-1&&r==-1)
        System.out.println("Queue underflows!!");
        else
        {
            val=q[f];
            if(f==size-1)
            f=0;
            else
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            {
                f=f+1;
                System.out.println("Deleted element :"+val);
            }
        }
    }
    /*displaying queue elements*/
    void display()
    {
        System.out.println("Elements of the queue:");
        for(int j=f;j<=r;j++)
        {
            System.out.println(q[j]);
        }
    }
    public static void main(String args[])
    {
        //defining main method
        Scanner in=new Scanner(System.in);
        int ele;
        boolean a=false;
        int choice;
        int n;
        System.out.println("Enter queue size");
        n=in.nextInt();
        Circular_Queue ob=new Circular_Queue(n);
        //creating object to invoke method for queue operation
        System.out.println("1 :To insert");
        System.out.println("2 :To delete");
        System.out.println("3 :To display");
        System.out.println("4 :To exit");
        System.out.println("Enter the choice");
        choice=in.nextInt();
        while(a==false)
        {
            switch(choice)//implementing operations using switch case
            {
                case 1://inserting elements in the queue
                System.out.println("Enter the element");
                ele=in.nextInt();
                ob.insertqueue(ele);
                System.out.println("Enter any of the above options to proceed");
                choice=in.nextInt();
                break;
                case 2://deleting element from the queue
                ob.deletequeue();
                System.out.println("Enter any of the above options to proceed");
                choice=in.nextInt();
                break;
                case 3:
                ob.display();
                System.out.println("Enter any of the above options to proceed");
                choice=in.nextInt();
                break;
                case 4:
                a=true;
                break;
                default:
                System.out.println("wrong choice!!");
                System.out.println("Enter any of the above options to proceed");
                choice=in.nextInt();
                break;
            }
        }
    }//end of main method
}//end of class
                