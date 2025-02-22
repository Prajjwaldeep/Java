import java.util.*;
public class Pascal
{
    public static int ncr(int c, int r)
    {
        int i,ans=1;
        for(i=0; i<r; i++)
        {
            System.out.println(ans);
            ans=ans*(c-i);
            ans=ans/(i+1);
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int c, r, i;
        System.out.println("Enter row and column number : ");
        r=in.nextInt();
        c=in.nextInt();
        System.out.println("Element at row "+r+" and column "+c+" is : "+ncr(c-1, r-1));
        System.out.print("\nWhich row to print : ");
        int r1=in.nextInt();
        int ans=1;
        for(i=0; i<r1-1; i++)
        {
            System.out.print(ans +" ");
            ans=ans*(r1-1-i);
            ans=ans/(i+1);
        }
        System.out.print(ans);
    }
}