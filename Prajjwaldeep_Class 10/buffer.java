import java.io.*;
class buffer
{
public static void main(String args[])throws IOException
{
  InputStreamReader read=new  InputStreamReader(System.in);
  BufferedReader in=new BufferedReader(read);
  int a,b,c,d;
  System.out.println("Enter the first number");
  a=Integer.parseInt(in.readLine());
  
  System.out.println("Enter the second number");
  b=Integer.parseInt(in.readLine());
  
  c=Math.max(a,b);
  d=Math.min(a,b);
  
  System.out.println("The greater number is "+c);
  System.out.println("The smaller number is "+d);  
}
}