/* A program to accept the number of boxes ofvthe cartons used in decreasing order of capacity
 * (i.e. preferance should be given to highest capacity availble, nd if boxes left are less than 6,
 * an extra carton of 6 should be used)
 */
import java.util.*;
public class Box_Packing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); // Set scanner class to read input
        System.out.print("Enter number of boxes to be packed : ");
        int N = sc.nextInt(); // read the number of boxes to be packed
        if(N<1 || N > 1000)// when N is less than 1 or more than 1000
        {
            System.out.println("INVALID INPUT"); // Display message
        }
        else // if the above condition is not satisfied
        {
            int cart[]={48,24,12,6}; 
            int copy=N;
            int totalCart=0, count=0;
            System.out.println("OUTPUT :"); // Display message
            for(int i=0; i<4; i++) // for loop to the number of cart
            {
                count=N/cart[i];
                if(count!=0) // When the value of count is not zero
                {
                    System.out.println("\t"+cart[i]+"\tx\t"+count+"\t= "+cart[i]*count); // Print message and the values
                }
                totalCart=totalCart+count; // Finding the total number of cart
                N = N % cart[i];
            }
            if(N>0) // When the value of N is greater than zero
            {
                System.out.println("\tRemaining Boxes   "+N+" x 1 = "+N); // Print message
                totalCart=totalCart+1; //Counting total number of carts
            }
            else // When the value of N is not greater than zero
            {
                System.out.println("\tRemaining Boxes\t\t= 0"); // Print message
            }
            System.out.println("\tTotal number of boxes   = "+copy); // Print message
            System.out.println("\tTotal number of cartons = "+totalCart); // Print message
        }
    }
}