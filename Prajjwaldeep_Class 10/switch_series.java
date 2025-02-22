import java.util.Scanner;
public class switch_series
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,c,r;
        System.out.println("Press 1 for the first series or press 2 for the second series");
        a=in.nextInt();
        switch(a)
        {
            case 1:
            int x=2,p,s=0;
            for (c=1; c<=20; c++)
            {
                p=1;
                for (r=1; r<=c; r++)
                p=p*x;
                if (c%2==0)
                s=s-p;
                else
                s=s+p;
            }
            System.out.println("Sum of the series : "+s);
            break;
            case 2:
            for (c=1; c<=5; c++)
            {
                for (r=1; r<=c; r++)
                {
                    System.out.print("1");
                }
                System.out.print(" ");
            }
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }
    }
}