public class pattern_12
{
    public static void main(String args[])
    {
        int c,r;
        for (c=1; c<=5; c++)
        {
            for (r=1; r<=5; r++)
            {
                if (c==r || (c+r)==6)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}