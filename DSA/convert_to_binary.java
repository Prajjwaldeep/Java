public class convert_to_binary
{
    public static void main(String args[])
    {
        int x=23;
        String str="";
        while(x!=0)
        {
            int rem=x%2;
            str=rem+str;
            x=x/2;
        }
        System.out.println(str);
    }
}