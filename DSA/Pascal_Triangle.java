import java.util.*;
public class Pascal_Triangle
{
    public static int findNcR(int c, int r)
    {
        int res=1;
        for(int i=0; i<r; i++)
        {
            res=res*(c-i);
            res=res/(i+1);
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int c, r;
        System.out.println("Enter column and row number : ");
        c=in.nextInt();
        r=in.nextInt();
        System.out.println(findNcR(c-1, r-1));
    
        System.out.println("Printing the entire nth row of the Pascal's Triangle");
        System.out.println("Enter nth row");
        int row, ans=1;
        row=in.nextInt();
        for(int i=0; i<row; i++)
        {
            System.out.print(ans+" ");
            ans=ans*(row-i)/(i+1);
        }
        System.out.println(ans);
    }
}