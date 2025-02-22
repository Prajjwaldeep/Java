public class for_10_char
{
    public static void main(String args[])
    {
        char c,r;
        for (c='a'; c<='e'; c++)
        {
            for (r='a'; r<=c; r++)
            {
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }
}