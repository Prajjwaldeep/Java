import java.util.Scanner;
class Electric
{
    public static void main(String args[])//declaration of mian method
    {
       int a,b;
       double c;
       String st;
       Scanner in=new Scanner(System.in);//declaration of scanner class
       System.out.println("Enter Consumer Name");//accepting consumer name
       st=in.next();
       a=st.length();
       System.out.println("Enter Consumer Number");//accepting consumer number
       b=in.nextInt();
       System.out.println("Enter Units Consumed");//accepting units consumed
       c=in.nextInt();
       System.out.println("West Bengal Board Of Electricity Commission");
       System.out.println("Money Recipient"); 
       System.out.println("Consumer name="+st);
       System.out.println("Consumer Number="+b);
       System.out.println("Units Consumed="+c);//displaying units consumed
       if(c<=100)
       System.out.println("Amount to be paid="+c*4.0);//diplaying the resultant amount
       if(c>100&&c<=200)
       System.out.println("Amount to be paid="+c*5.20);
       if(c>200&&c<=300)
       System.out.println("Amount to be paid="+c*6.48);
    }//end of main method
}//end of class
    
    