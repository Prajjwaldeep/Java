/*import java.util.*;
class D_Queue
{
    static int arr[];
    static int lim,front,rear;
    public D_Queue()
    {
        front=0;
        rear=0;
        arr=new int[100];
    }
    
    public D_Queue(int l)
    {
        lim=l;
        front=0;
        rear=0;
        arr=new int[l];
    }
    
    void addrear(int val)
    {
        if(rear<lim-1)
        {
            rear++;
            arr[rear]=val;
        }
        else
        {
            System.out.println("Overflow from rear");
        }
    }
    
    void addfront(int val)
    {
        if(front==0||front==1)
        {
            System.out.println("Overflow from front");
        }
        else
        {
            front--;
            arr[front]=val;
        }
    }
    
    int popfront()
    {
        if(front<=rear)
        {
            if(front==0)
            {
                front++;
            }
            int t=arr[front];
            front++;
            return(t);
        }
        else
        {
            return(-9999);
        }
    }
    
    int poprear()
    {
        if(front>rear||front==0||rear==0)
        {
            return(-9999);
        }
        else
        {
            int t=arr[rear];
            rear--;
            return(t);
        }
    }
    
    
    void display()
    {
        /*if(top==-1)
        {
           System.out.println("$$");
        }
        if(top==cap)
        {
           System.out.println("Stack Overflows");
        }
        else
        {*/
           System.out.println("ELements of dqueue:");
           for(int i=front;i>=rear;i--)
           {
              System.out.println(arr[i]+" ");
           }
        }
    
    
    public static void main(String args[])
    {
        int i,s=0,n2,s1;
        String n1;
        Scanner in=new Scanner(System.in);
        //Register ob=new Register(n2);
        System.out.println("Enter array size");
        n2=in.nextInt();
        D_Queue ob=new D_Queue(n2);
        System.out.println("Enter ur choice:");
        while(s!=3)
        {
           System.out.println("1:push(from rear end)");
           System.out.println("2:push(from front end)");
           System.out.println("3:pop(from rear end)");
           System.out.println("4:pop(from front end)");
           System.out.println("5:exit");
           s=in.nextInt();
           switch(s)
           {
              case 1:
              System.out.println("Enter the element u want 2 push");
              s1=in.nextInt();
              ob.addrear(s1);
              ob.display();
              break;
              case 2:
              System.out.println("Enter the element u want 2 push");
              s1=in.nextInt();
              ob.addfront(s1);
              ob.display();
              break;
              case 3:
              ob.poprear();
              ob.display();
              break;
              case 4:
              ob.popfront();
              ob.display();
              break;
              case 5:
              break;
              default:
              System.out.println("Invalid Input");
           }
        }
    }
}*/

    