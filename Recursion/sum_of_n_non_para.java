import java.util.*;
public class sum_of_n_non_para
{
    public static int add(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+add(n-1);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("N : ");
        int n;
        n=in.nextInt();
        System.out.println(add(n));
    }
} 