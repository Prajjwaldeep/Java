import java.util.Scanner;
public class white_space_upper
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1="";
        int a,l;
        char ch=' ',ch1;
        System.out.println("Enter the string : ");
        str=in.nextLine();
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch==' ')
            {
                ch1=str.charAt(a+1);
                str1=str1+' '+Character.toUpperCase(ch1);
                a=a+1;
            }
            else
            
            str1=str1+ch;
        }
        System.out.println("New string : "+str1);
    }
}