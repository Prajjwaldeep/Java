public class do_loop_while_1
{
    public static void main(String args[])
    {
        int c=1;
        do
       {
        int r=1;
        do
        {
            System.out.print(r);
            r++;
        }
        while(r<=c);
           System.out.println(c);
        c++;
       }
        while(c<=5);
    }
}