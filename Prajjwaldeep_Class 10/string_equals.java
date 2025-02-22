import java.util.Scanner;
class string_equals
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str1,str2;
        System.out.println("Input first string");
        str1=in.nextLine();
        System.out.println("Input seconde string");
        str2=in.nextLine();
        if (str1.equals(str2))
        System.out.println("Both string are equals ") ;
        else
        System.out.println("Both string are NOT equals") ;
    }
}