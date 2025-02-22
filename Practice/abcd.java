public class abcd
{
    public static int test(int n)
    {
        if(n==10)
        {
            return 0;
        }
        return 1+test(n+1);
    }
    public static void main(String args[])
    {
        int i=0;
        System.out.print(test(i));
    }
}