import java.io.*;
class buffer_IF
{
public static void main(String args[])throws IOException
{
  InputStreamReader read=new  InputStreamReader(System.in);
  BufferedReader in=new BufferedReader(read);
  int a,b,c;
  System.out.println("Enter the first number");
  a=Integer.parseInt(in.readLine());
  
  System.out.println("Enter the second number");
  b=Integer.parseInt(in.readLine());
  
  System.out.println("Enter the third number");
  c=Integer.parseInt(in.readLine());
  
  if(a>b && a>c)
  {
      System.out.println("The greater number is  " +a);
  }
  if(a<b && a<c)
  {
      System.out.println("The smallest number is  " +a);
  }if(b>a && b>c)
  {
      System.out.println("The greater number is  " +b);
      
  }
  if(b<a && b<c)
  {
      System.out.println("The smallest number is  " +a);
  }
  if(c>b && c>a)
  {
      System.out.println("The greater number is  " +c);
  }
  if(c<b && c<a)
  {
      System.out.println("The smallest number is  " +a);
  }




}
}