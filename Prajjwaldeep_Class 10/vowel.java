import java.util.Scanner;
class vowel
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,v=0;
        String s;
        System.out.print("Enter the string: ");
        s=in.nextLine();
        l=s.length();
        for(int a=0;a<l;a++)
        {
            char ch=s.charAt(a);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            v=v+1;
        }
        System.out.println("Total vowel is = "+v);
    }
}