public class prac_pattern_10
{
    public static void main(String args[])
    {
        int c,r,count=0;
        for (c=1; c<5; c++)
        {
            for (r=1; r<=5; r=r+2)
            {
                System.out.print(count+" ");
                ++count;
            }
            System.out.println();
        }
    }
}