import java.util.*;
public class print_n_to_1
{
    public static void iterate(int n)
    {
        if(n<1)
        {
            return;
        }
        System.out.print(n+" ");
        iterate(n-1);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("N : ");
        int n;
        n=in.nextInt();
        iterate(n);
    }
} 