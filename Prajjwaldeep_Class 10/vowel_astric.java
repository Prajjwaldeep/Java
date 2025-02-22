import java.util.Scanner;
public class vowel_astric
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,str1;
        System.out.println("Enter the string : ");
        str=in.nextLine();
        str1=str.replaceAll("[AEIOUaeiou]","*");
        System.out.println(str1);
    }
}