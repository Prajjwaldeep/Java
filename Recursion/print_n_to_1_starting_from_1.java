import java.util.*;
public class print_n_to_1_starting_from_1
{
    public static void iterate(int i, int n)
    {
        if(i>n)
        {
            return;
        }
        iterate(i+1,n);
        System.out.print(i+" ");
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