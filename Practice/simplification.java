import java.util.*;
public class simplification
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,deno,a,m,gcd=1;
        System.out.println("Enter numerator and denominator respectively :");
        num=in.nextInt();
        deno=in.nextInt();
        m=Math.min(num,deno);
        for (a=2; a<=m; a++)
        {
            if(num%a==0 && deno%a==0)
            {
                gcd=a;
            }
        }
        num=num/gcd;
        deno=deno/gcd;
        if(deno==0)
        {
            System.out.println("Error");
        }
        else if(deno==1)
        {
            System.out.println(num);
        }
        else
        {
            System.out.println(num+"/"+deno);
        }
    }
}
