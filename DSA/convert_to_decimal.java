public class convert_to_decimal
{
    public static void main(String args[])
    {
        String str="1101";
        int n=str.length();
        int num=0, pow=1;
        char ch;
        for(int i=n-1; i>=0; i--)
        {
            ch=str.charAt(i);
            if(ch=='1')
            {
                num+=pow;
            }
            pow*=2;
        }
        System.out.println(num);
    }
}