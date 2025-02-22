public class prac_pattern_9
{
    public static void main(String args[])
    {
        int c,r,k=1;
        for (c=1; c<=5; c++)
        {
            for (r=1; r<=c; r++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}