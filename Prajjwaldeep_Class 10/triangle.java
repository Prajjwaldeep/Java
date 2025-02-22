public class triangle
{
    public static void main(String args[])
    {
        int i, j, k=8;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<k; j=j+2)
            {
                System.out.print(" ");
            }
            k = k - 2;
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}