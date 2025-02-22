import java.util.*;
public class str_ptrn_2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,l;
        String str;
        System.out.print("Enter the string : ");
        str=in.next();
        l=str.length();
        for (a=0; a<l; a++)
        {
            System.out.print(str.substring(a,l));
            System.out.print(" ");
            System.out.print(str.substring(0,a));
            System.out.println();
        }
    }
}