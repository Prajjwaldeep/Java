import java.util.*;
public class string_sort_lexographically	
{
    public static void output(String str)
    {
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        System.out.println(new String(ch));
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t,a;
        String str;
        System.out.println("Enter the number of test cases : ");
        t=in.nextInt();
        System.out.println("Enter "+t+" strings :");
        for(a=0; a<t; a++)
        {
            str=in.next();
            output(str);
        }
    }
}