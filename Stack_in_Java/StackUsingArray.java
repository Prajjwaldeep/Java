public class StackUsingArray
{
    private int data[];
    private int top;
    public StackUsingArray(int capacity)
    {
        data=new int[capacity];
        top=-1;
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public int size()
    {
        return top+1;
    }
    public int top() throws StackEmptyException
    {
        if(size()==0)
        {
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        return data[top];
    }
    public void doubleCapacity()
    {
        int temp[]=data;
        data=new int[2*temp.length];
        int i;
        for(i=0; i<=top; i++)
        {
            data[i]=temp[i];
        }
    }
    public void push(int element) throws StackFullException
    {
        if(size()==data.length)
        {
            /*StackFullException e=new StackFullException();
            throw e;*/
            doubleCapacity();
        }
        
        top++;
        data[top]=element;
    }
    public int pop() throws StackEmptyException
    {
        if(size()==0)
        {
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        int temp=data[top];
        top--;
        return temp;
    }
}