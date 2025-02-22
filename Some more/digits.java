class digits
{
    public static void main(String args[])
    {
        int number=12345;
        int a=0;
        int b=0;
        int c=0;
        while(number!=0)
        {
            a=number%10;
            number=number/10;
            b=number%10;
            number=number/10;
            c=number%10;
            number=number/10;
            if((a-b)!=c)
            {
                System.out.println("Not Matched");
                break;
            }
        }
        System.out.println("Matched");
    }
}