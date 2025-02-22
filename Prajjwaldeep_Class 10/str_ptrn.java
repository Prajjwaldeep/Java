import java.util.Scanner;
public class str_ptrn
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,l;
        String str;
        System.out.print("Enter the string : ");
        str=in.next();
        l=str.length();
        for (a=0; a<=l; a++)
        {
            System.out.println(str.substring(0,a));
        }
    }
}