import java.util.Scanner;
public class sub_string_name
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a,x;
        int len;
        System.out.println("Input your name");
        a=in.nextLine();
        len=a.length();
        for(int q=0; q<=len; q++)


        System.out.println(a.substring(0,q));
    }
}