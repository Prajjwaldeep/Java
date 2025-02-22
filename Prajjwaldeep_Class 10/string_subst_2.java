import java.util.Scanner;
public class string_subst_2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a;
        char b;
        int c,r;
        System.out.print("Enter the String :");
        a=in.next();
        c=a.length();
        for (r=0; r<c; r++)
        {
      System.out.print(a.substring(r,c));
      System.out.print(a.substring(0,r));
      System.out.println();

    }
}
}