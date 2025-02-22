public class for_floyds
{
    public static void main(String args[])
    {
        int c,r1,r,k=1;
        for(c=1; c<=5; c++)
        {
            for(r=1; r<=c; r++)
                {
                    if (k<10)
                    System.out.print(k+"  ");
                    else
                    System.out.print(k+" ");
                    k++;
                }
                System.out.println();
            }
        }
    }