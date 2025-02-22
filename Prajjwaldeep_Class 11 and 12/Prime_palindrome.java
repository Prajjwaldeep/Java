import java.util.*;
class Prime_palindrome
{
    Scanner in=new Scanner(System.in);
    //  Function isPrime( ) returns 'true' when the number 'x' is Prime and 'false' if it is not. */
    boolean isPrime(int x)
    {
        int count=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
                count++;
        }
        if(count==2)
            return true;
        else
            return false;
    }
    // Function isPalin( ) returns 'true' when 'x' is a Palindrome and 'false' if it is not.
    boolean isPalin(int x)
    {
        int rev=0,dig;
        int copy=x;
        while(x>0)
        {
            dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(rev==copy)
            return true;
        else
            return false;
    }
    /* Function showPalPrime( ) accepts the lower and upper limit, and prints all the PalPrime numbers
    in between that range by sending each numbers in the range to both the functions isPrime( ) and isPalin( ) */
 
    public void showPalPrime()
    {
        int m,n;
        int c=0;
        System.out.print("Enter the range : ");
        m=in.nextInt();
        n=in.nextInt();
        if(m>=n || m>=3000 || n>=3000) // Checking the range of Limits as given in the question
            System.out.println("OUT OF RANGE");
        else
        {
            System.out.println("THE PRIME PALINDROME INTEGERS ARE : ");
            /* The below for loop generates every number starting from 'm' till 'n' and sends it
            to both functions isPalin() and isPrime(), to check whether they are both Palindrome and
            prime or not. If yes, then they are printed. */
            for(int i=m; i<=n; i++)
            {
                if(isPrime(i)==true && isPalin(i)==true)
                {
                    System.out.println(i);
                    c++; // Counting the frequency of prime palindrome.
                }
            }
            System.out.println("FREQUENCY OF PRIME PALINDROME INTEGERS : "+c);
        }
        // The main method creates an object of PalPrime Class and calls the function showPalPrime()
    }
    public static void main(String args[])
    {
        Prime_palindrome ob=new Prime_palindrome();
        ob.showPalPrime();
    }
}