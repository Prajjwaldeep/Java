import java.io.*;
class table_1_to_10
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter any number from 1 to 10 to display its table upto its 10 multiples");
        int n=Integer.parseInt(br.readLine());
        int a,b,c,d,e,f,g,h,i,j;
        if(n>0&&n<=10)
        {
            a=n*1;
            b=n*2;
            c=n*3;
            d=n*4;
            e=n*5;
            f=n*6;
            g=n*7;
            h=n*8;
            i=n*9;
            j=n*10;
            System.out.println("Table of "+n+" is:");
            System.out.println(n+" * 1 = "+a);
            System.out.println(n+" * 2 = "+b);
            System.out.println(n+" * 3 = "+c);
            System.out.println(n+" * 4 = "+d);
            System.out.println(n+" * 5 = "+e);
            System.out.println(n+" * 6 = "+f);
            System.out.println(n+" * 7 = "+g);
            System.out.println(n+" * 8 = "+h);
            System.out.println(n+" * 9 = "+i);
            System.out.println(n+" * 10 = "+j);
        }
    }
}