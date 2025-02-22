import java.util.Scanner;
class string_substring_s3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a;
        String s1,s2;
        System.out.print("Enter your name : ");
        s1=in.nextLine();
        l=s1.length();
        for(a=0;a<=5;a++)
        {
            System.out.print(s1.substring(a,l));
            System.out.print(s1.substring(0,a));
            System.out.println();
        }
    }
}