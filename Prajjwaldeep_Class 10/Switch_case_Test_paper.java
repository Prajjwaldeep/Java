import java.util.Scanner;
public class Switch_case_Test_paper
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int p,t,ab;
        double i=0,amt,a;
        System.out.println("Enter principal, term(in years) and your age");
        p=in.nextInt();
        t=in.nextInt();
        a=in.nextDouble();
        {
            if (a<60)
            ab=1;
            else
            ab=2;
        }
        switch(ab)
        {
            case 1:
            {
                if (t<=1)
                i=7.5/100*p;
                else if (1<t && t<=2)
                i=8.5/100*p;
                else if (2<t && t<=3)
                i=9.5/100*p;
                else if (3<t)
                i=10.0/100*p;
            }
            amt=p+i;
            System.out.println("General Category");
            System.out.println("The principal is "+p+" the interest is "+i);
            System.out.println("The amount paid :"+amt);
            break;
            case 2:
            {
                if (t<=1)
                i=8.0/100*p;
                else if (1<t && t<=2)
                i=9.0/100*p;
                else if (2<t && t<=3)
                i=10.0/100*p;
                else if (3<t)
                i=11.0/100*p;
            }
            amt=p+i;
            System.out.println("Senior Citizen Category");
            System.out.println("The principal is "+p+" the interest is "+i);
            System.out.println("The amount paid :"+amt);
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }
    }
}