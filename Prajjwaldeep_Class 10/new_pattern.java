public class new_pattern
{
    public static void main(String args[])
    {
        int c,r1,r,k=1;
        for(c=1; c<=5; c++)
        {
            for (r1=c; r1<=4; r1++)
            {
                System.out.print(" ");
            }
            for(r=1; r<=c; r++)
                {
                    {
                        if (c==1)
                    System.out.print("A ");
                    else if (c==2)
                    System.out.print("B ");
                    else if (c==3)
                    System.out.print("C ");
                    else if (c==4)
                    System.out.print("D ");
                    else
                    System.out.print("E ");
                }
                k++;
            }
            System.out.println();
        }
    }
}