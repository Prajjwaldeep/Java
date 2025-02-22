import java.util.*;
public class ISBN_2013
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String isbn,nstr;
        System.out.print("INPUT CODE"+"\t"+":"+"\t");
        isbn=in.next();
        int l=isbn.length(),a,w=0,k=10,sum=0,x2,i;
        String x1;
        char ch;
        if (l!=10)
        {
            System.out.println("OUTPUT"+"\t\t"+":"+"\t"+"INVALID INPUT");
        }
        else
        {
            for (a=0; a<l; a++)
            {
                ch=isbn.charAt(a);
                if (ch=='X' || ch=='x')
                {
                    isbn=isbn.substring(0,(l-1));
                    char ch1=isbn.charAt(a-1);
                    x1=String.valueOf(ch1);
                    x2=Integer.valueOf(x1);
                    while (k>=2)
                    {
                        sum=sum+(x2*k);
                        k--;
                    }
                    sum=sum+10;
                }
                else
                {
                    x1=String.valueOf(ch);
                    x2=Integer.valueOf(x1);
                    sum=sum+(x2*k);
                    k--;
                }
            }
            if (sum%11==0)
            {
                System.out.println("OUTPUT"+"\t\t"+":"+"\t"+"SUM="+sum);
                System.out.println("\t\t"+"\t"+"LEAVES NO REMINDER-VALID ISBN CODE");
            }
            else
            {
                System.out.println("OUTPUT"+"\t\t"+":"+"\t"+"SUM="+sum);
                System.out.println("\t\t"+"\t"+"LEAVES REMINDER-INVALID ISBN CODE");
            }
        }
    }
}