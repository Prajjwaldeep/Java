/*
 This is a game of guesses. User need to guess a number between 1 and 100.
 If the input is less than the actual number, we will print message "Higher number please !", or else if the input
 is lower, we will print "Lower number please !". The process continues until the user make correct guess of the number.
 If he does guess it correctly, a message will be displayed congratulating him displaying the number of attempts he made to
 get to the correct number.
 */
import java.util.*;
public class project
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int myNumber,userNumber=0,count=1;
        myNumber=(int)(Math.random()*100);
        System.out.println("Enter a number betwenh 1 and 100 : ");
        while(userNumber!=myNumber)
        {
             userNumber=in.nextInt();
            if(userNumber<myNumber)
            {
                System.out.println("Higher number please !");
                count++;
            }
            else if(userNumber>myNumber)
            {
                System.out.println("Lower number please !");
                count++;
            }
            else
            {
                System.out.println("Congratulations ! you gussed it in "+count+" attempt(s)!");
                break;
            }
        }
    }
}