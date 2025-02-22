class Dequeue
{
    int arr[];
    int lim;
    int front;
    int rear;
    public Dequeue(int l)
    {
        lim = l;
        front = 0;
        rear = 0;
    }
    public void addFront(int val)
    {
        if(front - 1 >= 0)
        {
            arr[--front] = val;
        }
        else
        {
            System.out.println("Overflow from front");
        }
    }
    public void addRear(int val
    ){
        if(rear + 1 < lim)
        {
            arr[++rear] = val;
        }
        else
        {
            System.out.println("Overflow from rear");
        }
    }
    public int popFront()
    {
        if(front + 1 <= rear)
        {
            return arr[front--]; 
        }
        return -9999; 
    } 
    public int popRear(){ 
        if(rear - 1 >= front)
        {
            return arr[rear--];
        }
        return -9999;
    }
}