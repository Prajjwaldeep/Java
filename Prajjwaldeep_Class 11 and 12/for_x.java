public class for_x
{
    public static void main(int n)
    {
        int c,r;
        for (c=0; c<n; c++)
        {
            for (r=0; r<n; r++)
            {
                if (c==r || (c+r)==(n-1))
                System.out.print(r+" ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}