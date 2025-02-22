import java.util.Scanner;
public class string2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,l;
        String str,str1="",str2="";
        char ch,ch1;
        System.out.println("Enter the name : ");
        str=in.nextLine();
        ch=str.charAt(0);
        boolean t=Character.isUpperCase(ch);
        System.out.println("First character is Upper Case : "+t);
    }
}