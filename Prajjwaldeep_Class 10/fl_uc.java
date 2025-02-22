import java.util.Scanner;
public class fl_uc
{
    public static void main(String args[])
    {
        Scanner ca=new Scanner(System.in);
        String str,str1;
        int l,a;
        char ch;
        System.out.println("Input string : ");
        str=ca.nextLine();
        l=str.length();
        ch=Character.toUpperCase(str.charAt(0));
        str1=str.substring(1,l);
        System.out.println("New string : "+ch+str1);
    }
}