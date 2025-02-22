import java.io.*;
class Invalid_Character
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter three numbers.After entering if you want to add them please type 's'.If you want to multiply them please type 'p'");
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        String n3=br.readLine();
        int a;
        if(n4=='s')
        {
            a=n1+n2+n3;
            System.out.println("Sum of the numbers are= "+a);
        }
        else if(n4=='p')
        {
            a=n1*n2*n3;
            System.out.println("Product of the numbers are= "+a);
        }
        else if((n4!='s')||(n4!='p'))
        {
            System.out.println("Invalid Character");
        }
    }
}