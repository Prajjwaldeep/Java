public class pattern
{
    public static void main(String args[])
    {
        int c,r;
        for (c=1; c<=5; c++)
        {
            for (r=1; r<=c; r++)
            {
                System.out.print(r+" ");
            }
            for (r=4; r>=c; r--)
            {
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }
}