class const
{
    int a,b;
    const(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("Value of a is "+a+" and b is "+b);
    }
}
class const
{
    public static void main(String args[])
    {
        const ob=new const(10,2);
        ob.display();
    }
}