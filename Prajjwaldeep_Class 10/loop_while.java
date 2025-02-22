public class loop_while
{
    public static void main(String args[])
    {
        int c=1;
        while(c<=5)
        {
            int r=1;
            while(r<=c)
            {
            System.out.print(r);
            r++;
            }
        System.out.println();
        c++;
        }
    }
}