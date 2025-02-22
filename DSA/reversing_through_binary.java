import java.util.*;
public class reversing_through_binary
{
    public static int operation(int x)
    {
        int m=x;
        int mask=0;
        int ans;
        if(x==0)
        {
            return 1;
        }
        while(m!=0)
        {
            mask=mask<<1|1;
            m=m>>1;
            
        }
        ans=(~x) & mask;
        return ans;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("The number : ");
        num=in.nextInt();
        System.out.println(operation(num));
    }
}