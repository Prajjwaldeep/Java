import java.util.Scanner;
public class New_string
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,l,z;
        String str,str1="";
        char ch,ch1,ch2;
        System.out.println("Enter the name : ");
        str=in.nextLine();
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (ch==' ')
            break;
            str1=str1+ch;
        }
    System.out.println("New String : "+str1);
}
}