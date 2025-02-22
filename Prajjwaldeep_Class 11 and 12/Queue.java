class Queue
{
    int Que[];
    int size;
    int front;
    int rear;
    void addele(int v)
    {
        if(rear==-1)
        {
            front=0;
            rear=0;
            Que[rear]=v;
        }
        else if(rear+1<Que.length)
        
        Que[++rear]=v;
        else
        System.out.println("Overflow");
    }
    int delete()
    {
        int element;
        if(front==0)
        {
            System.out.println("Underflow");
            return -9999;
        }
        else if (front==rear)
        {
            element=Que[front];
            front=rear=0;
            return element;
        }
        else
        return (Que[front++]);
    }
}