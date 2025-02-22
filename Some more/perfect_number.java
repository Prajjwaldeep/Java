import java.io.*;
class perfect_number
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to check it is a perfect number or not");
        int n=Integer.parseInt(br.readLine());
        for(int x=1;x<n;x++)
        {
            int s;
            if(n%x==0)
            {
                s=s+x;
            }
            else if(s==n)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}