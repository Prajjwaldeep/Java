import java.util.*;
public class sum_of_n_para
{
    public static void add(int n, int sum)
    {
        if(n==0)
        {
            System.out.println(sum);
            return;
        }
        add(n-1,sum+n);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("N : ");
        int n,sum=0;
        n=in.nextInt();
        add(n,sum);
    }
} 