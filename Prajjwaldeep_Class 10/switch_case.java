import java.util.Scanner;
public class switch_case
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a;
        System.out.print("Enter 1 for series and 2 for pattern : ");
        a=in.nextInt();
        switch (a)
        {
            case 1:
            int q,n;
            double sum=0.0;
            System.out.println("Enter the last term : ");
            n=in.nextInt();
            for (q=0; q<n; q++)
            {
                sum=sum+(q/Math.pow(q,2));
            }
            System.out.println("Sum of the series is : "+sum);
            break;
            case 2:
            int c,r;
            for (c=5; c>=1; c--)
            {
                for (r=c; r>=1; r--)
                {
                    System.out.print(r);
                }
                System.out.println();
            }
                break;
                default :
                System.out.println("Wrong Choice");
            }
        }
    }