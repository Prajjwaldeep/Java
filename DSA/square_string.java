import java.util.*;
public class square_string
{
    static int arr[]=new int[26];
    public static void output(String str)
    {
        int length=str.length();
        if((length%2)!=0)
        {
            System.out.println("NO");
        }
        else
        {
            String nstr1,nstr2;
            nstr1=str.substring(0,(length/2));
            nstr2=str.substring((length/2),length);
            if(nstr1.equals(nstr2))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t,i;
        String str;
        System.out.println("Enter test cases :");
        t=in.nextInt();
        System.out.println("Enter "+t+" strings :");
        for(i=0; i<t; i++)
        {
            str=in.next();
            output(str);
        }
    }
}