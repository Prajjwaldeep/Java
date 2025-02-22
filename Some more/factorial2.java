class factorial2
{
    public static void main(int n)
    {
        int a=1;
        while(n>0)
        {
            a=a*n;
            n=n-1;
        }
        System.out.println(a);
    }
}