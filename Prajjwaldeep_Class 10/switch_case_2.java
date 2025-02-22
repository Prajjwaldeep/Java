import java.util.Scanner;
public class switch_case_2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m;
        System.out.print("Enter 1 for series and 2 for pattern : ");
        m=in.nextInt();
        switch (m)
        {
            case 1:
            int n,q,sum=1;
            System.out.println("Enter the last term : ");
            n=in.nextInt();
            for (q=1; q<=n; q++)
            {
                sum=sum+(q*q);
            }
            System.out.println(sum);
            break;
            case 2:
            String str;
            int a,l;
            System.out.println("Enter the string : ");
            str=in.next();
            l=str.length();
            for (a=0; a<=l; a++)
            {
                System.out.println(str.substring(0,a));
            }
            break;
            default :
            System.out.println("Wrong Choice");
        }
    }
}