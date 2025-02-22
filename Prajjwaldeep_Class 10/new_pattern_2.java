public class new_pattern_2
{
    public static void main(String args[])
    {
        int c,r,k;
        for (c=1; c<=4; c++)
        {
            for (r=c; r<=5; r++)
            {
                if (r==1)
                System.out.print("B");
                else if (r==2)
                System.out.print("L");
                else if (r==3)
                System.out.print("U");
                else if (r==4)
                System.out.print("E");
                else
                System.out.print("J");
            }
            for (k=1; k<=(c-1); k++)
            {
                if (k==1)
                System.out.print("B");
                else if (k==2)
                System.out.print("L");
                else
                System.out.print("U");
            }
            System.out.println();
        }
    }
}