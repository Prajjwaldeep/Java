class Register
{
    String stud[];
    int cap;
    int top;
    int ctr;
    Register(int max)
    {
        stud=new String[max];
        cap=max;
        top=-1;
        ctr=0;
    }
    void push(String n)
    {
        if (top>=cap-1)
        System.out.println("Overflow");
        else
        {
            top++;
            stud[top]=n;
            ctr++;
        }
    }
    String pop()
    {
        String S=" ";
        if (top<0)
        System.out.println("$$");
        else
        {
            S=stud[top];
            top--;
            ctr--;
        }
        return S;
    }
    void display()
    {
        for (int i=0; i<=top; i++)
        System.out.println(stud[i]);
    }
}