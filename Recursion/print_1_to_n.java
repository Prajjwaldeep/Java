import java.util.*;
public class print_1_to_n
{
    public static void iterate(int i, int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.print(i+" ");
        iterate(i+1,n);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("N : ");
        int n,i=1;
        n=in.nextInt();
        iterate(i,n);
    }
} 