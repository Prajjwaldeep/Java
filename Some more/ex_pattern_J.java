class ex_pattern_J
{
    public static void main(String args[])
    {
        int a,b;
        for(a=9;a>=1;a=a-2)
        {
            for(b=9;b>=a;b=b-2)
            System.out.print(b+" ");
            System.out.println();
        }
    }
}