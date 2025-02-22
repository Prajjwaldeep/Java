class my_factorial
{
    public static void main(String args[])
    {
        int a,b=1;
        for(a=1;a<=10;a++)
        {
            b*=a;
            System.out.println("Factors of "+a+" is "+b);
        }
    }
}