import java.util.Scanner;
class string_substring_s
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a;
        String s1,s2;
        System.out.print("Enter your name : ");
        s1=in.nextLine();
        l=s1.length();
        for(a=0; a<=l; a++)
        {
            System.out.println(s1.substring(0,a));
        }
}
}