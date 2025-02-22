import java.io.*;
class wrong_HCF_LCM
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers to find HCF and LCM");
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int h=1;
        int p=m*n;
        for(int i=2;i<p;i++)
        {
            if((m%i==0)&&(n%i==0))
            {
                h=1;
            }
        }
        int l=p/h;
        System.out.println("HCF= "+h);
        System.out.println("LCM= "+l);
    }
}