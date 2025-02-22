/**
 * A program to implement the queue data structure
 */
import java.util.*;
class Repeat
{
    static int cap;//variable to store the size of the array
    static int f;//varialbe to indicate the front
    static int r;//variable to indicate the rear
    int st[];//array to store the values
    Repeat(int m)//constructor to initialize the data members
    {
        cap=m;
        f=-1;
        r=-1;
        st=new int[cap];
    }
    
    public void pushvalue(int v)//method to insert an element 
    {
        if(r==cap-1)
        {
           System.out.println("OVERFLOW");//checking for overflow
        }
        else 
        {
            if(f==-1&&r==-1)
            {
                f=0;
                r=0;
            }
            else
            {
               r=r+1;
            }
            st[r]=v;
        }
    }
    
    public int popvalue()//method to pop an element
    {
        int v;
        if(f==-1&&r==-1)
        {
           return(-9999);//checking for underflow
        }
        else 
        {
            v=st[f];
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            {
                f=f+1;
            } 
            return(v);
        }
    }
    
    void display()//method to display the final array
    {
        if(f==-1&&r==-1)
        {
            System.out.println("-9999");//display underflow 
        }
        else if(r==cap)
        {
            System.out.println("OVERFLOW");//display overflow
        }
        else 
        {
           System.out.println("ELements of queue:");//display elements of the queue
           for(int i=f;i<=r;i++)
           {
               System.out.println(st[i]+" ");
           }
        }
    }
    
    public static void main(String args[])//declaration of main method
    {
        int i,s=0,n2,s1;
        Scanner in=new Scanner(System.in);//declaration of scanner class
        System.out.println("Enter array size");//accepting array size
        n2=in.nextInt();
        Repeat ob=new Repeat(n2);//creating an object of class Repeat
        System.out.println("Enter ur choice:");
        while(s!=3)
        {
           System.out.println("1:push");
           System.out.println("2:pop");
           System.out.println("3:exit");
           s=in.nextInt();
           switch(s)
           {
              case 1:
              System.out.println("Enter the element u want 2 push");//accepting user's choice to insert an element
              s1=in.nextInt();
              ob.pushvalue(s1);
              ob.display();
              break;
              case 2:
              ob.popvalue();//accepting user's choice to delete an element
              ob.display();
              break;
              case 3:
              break;
              default:
              System.out.println("Invalid Input");
           }//end of switch case
        }
    }//end of main method
}//end of class Repeat
