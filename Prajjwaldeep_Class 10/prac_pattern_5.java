public class prac_pattern_5
{
    public static void main(String args[])
    {
        int c,r;
        for (c=5; c>=1; c--)
        {
            for (r=5; r>=c; r--)
            {
                System.out.print(r);
            }
            System.out.println();
        }
    }
}