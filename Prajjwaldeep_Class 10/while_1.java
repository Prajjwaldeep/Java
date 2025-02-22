import java.util.Scanner;
public class while_1
{
   public static void main(String args[])
   {
      Scanner ab=new Scanner(System.in);
      int x,a;
      System.out.println("Input a number less than 20 for loop");
      x=ab.nextInt();
      while( x < 20 ) 
      {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }
   }
}