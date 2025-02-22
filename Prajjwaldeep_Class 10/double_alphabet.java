import java.util.Scanner;
public class double_alphabet
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,l,count=0;
        String str;
        char ch,ch1;
        System.out.print("Enter the string: ");
        str=in.nextLine();
        str=str.toUpperCase();
        l=str.length();
        for(a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (a==l-1)
            break;
            ch1=str.charAt(a+1);
            if (ch==ch1)
            count++;
        }
        System.out.println("Number of double alphabet : "+count);
    }
}