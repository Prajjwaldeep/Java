import java.util.*;
public class Banner_01
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int N,a=0,l=0,b=0;
        System.out.print("Enter the number of teams : ");
        N=in.nextInt();
        if (N<=2 || N>=9)
        {
            System.out.println("INVALID INPUT.");
        }
        else
        {
            String arr[]=new String[N];
            for (a=0; a<N; a++)
            {
                System.out.println("Enter name of team "+(a+1)+" : ");
                arr[a]=in.next();
                if (l<arr[a].length())
                {
                    l=arr[a].length();
                }
            }
            for (a=0; a<l; a++)
            {
                for (b=0; b<N; b++)
                {
                    if (a<arr[b].length())
                    {
                        System.out.print(arr[b].charAt(a)+"\t");
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }
    }
}