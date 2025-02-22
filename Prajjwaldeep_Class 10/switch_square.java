import java.util.Scanner;
class switch_square
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a, c;
        double square,cube;
        
        System.out.println("Enter the number of which square root is to be done");
       a=in.nextInt();
       
       System.out.println("Enter 1 for square root and 2 for cube");
      c=in.nextInt();
     
      switch(c)
      {
      case 1:
      square=Math.sqrt(a);
      System.out.println("Square of " +a + " is " + square);
      break;
      
      case 2:
      cube=Math.pow(a,3);
      System.out.println("cube of " +a + " is " + cube);
      break;
      
      default:
      System.out.println("wrong choice");
    }
}
}
      