public class for_11
{
    public static void main(String args[])
    {
        int c,r;
        for(c=1; c<=5; c++)
        {
            for(r=1; r<=c; r++)
            {
                if (r%2==0)
                System.out.print("#");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}