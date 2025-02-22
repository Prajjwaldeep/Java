public class ptrn
{
    public static void main(String args[])
    {
        int c,r;
        char ch='A';
        for (c=1; c<=5; c++)
        {
            for (r=1; r<=c; r++)
            {
              System.out.print(ch);
              ch++;
            }
            System.out.println();
        }
    }
}