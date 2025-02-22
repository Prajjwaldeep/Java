class loop
{
    public static void main(int a)
    {
        int b,c;
        if(a>=0&&a<100)
        {
            System.out.println("Oh you want loop from "+a+"!FORWARD");
        while(a>=0&&a<100)
        {
            b=a;
            c=a+1;
            System.out.print(b+" "+c+" ");
            a++;
        }
    }
    else if(a<=0&&a>-100)
    {
        System.out.println("Oh you want loop from "+a+"!BACKWARD");
        while(a<=0&&a>-100)
        {
            b=a;
            c=a-1;
            System.out.print(b+" "+c+" ");
            a--;
        }
    }
    }
}