class binary
{
    public static void main(int a)
    {
        while(a>1)
        {
            int n=a/2;
            int o=n*2;
            if(a-o==1)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
            a=a/2;
        }
        System.out.println("1");
    }
}