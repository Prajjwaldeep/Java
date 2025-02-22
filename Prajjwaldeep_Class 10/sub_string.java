import java.util.Scanner;
class sub_string
{
    public static void main(String args[])
    {
        String str="IRONMAN";
        char ch='R',ch1='A';
        int a,b;
        a=str.indexOf(ch);
        b=str.indexOf(ch1);
        String str1=str.substring(a,b);
        System.out.println(str1);
    }
}