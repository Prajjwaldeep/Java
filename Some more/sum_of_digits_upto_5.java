import java.io.*;
class sum_of_digits_upto_5
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number upto 5 digit to find its sum of digits");
        int n=Integer.parseInt(br.readLine());
        int a,b,c,d,f,g,h,i,j,k,l,m,o,p,q,r,s,t,u,v,w;
        a=n%10;
        b=n/10;
        c=a+b;
        d=n/100;
        f=n%100;
        g=f/10;
        h=n%10;
        c=d+g+h;
        i=n/1000;
        j=n/100;
        k=j%10;
        l=n%10;
        m=n/10;
        o=m%10;
        c=i+k+l+o;
        p=n/10000;
        q=n/10;
        r=n%10;
        s=q%10;
        t=q/10;
        u=t%10;
        v=t/10;
        w=v%10;
        c=p+r+s+u+w;
        System.out.println("Sum of the digits of "+n+" = "+c);
    }
}