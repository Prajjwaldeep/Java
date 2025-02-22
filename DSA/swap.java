public class swap
{
    public static void main(String args[])
    {
        int a=3, b=5;
        a=a^b;
        b=a^b; // a^b^b
        a=a^b; // a^b^a
        System.out.println(a+" "+b);
        int c=3, d=5;
    }
}