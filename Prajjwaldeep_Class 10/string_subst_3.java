import java.util.Scanner;
public class string_subst_3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a;
        char b;
        int l,r,p,k=1;
        System.out.print("Enter the String :");
        a=in.next();
        l=a.length();
        for (r=l; r>=0; r--)
        {
            for(p=1;p<=k;p++)
            {
                System.out.print(" ");
            }
            System.out.println(a.substring(0,r));
            k++;
    }
}
}