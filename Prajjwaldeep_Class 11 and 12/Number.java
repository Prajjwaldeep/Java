public class Number //Question 5
{
    int a;
    Number(int x)
    {
        a=x;
    }
    static void swap(Number ob1, Number ob2)
    {
        int t;
        t=ob1.a;
        ob1.a=ob2.a;
        ob2.a=t;
    }
    void display()
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Number ob1=new Number(5);
        Number ob2=new Number(6);
        ob1.display();
        ob2.display();
        swap(ob1,ob2);
        ob1.display();
        ob2.display();
    }
}