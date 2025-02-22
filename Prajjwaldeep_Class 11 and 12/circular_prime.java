/* Program to accept a positive number N and check whether it is a circular prime or not. The new
 * numbers formed after the shifting of the digits is also displayed
 */
import java.util.*;
class circular_prime
{ 
    // Function to check if a number is prime or not. 
    static boolean isPrime(int n) // Boolean to check the value is a prime or not
    { 
        // Corner cases
        if (n<=1) // If the input is less than or equal to one
        {
            return false; // Return false value
        }
        if (n <= 3) // If the input is less than or equal to three
        {
            return true; // Return false value 
        }
        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (n%2==0 || n%3==0) // If the input is divisable by 2 or 3
        {
            return false;  // Return false value
        }
        for (int i=5; i*i<=n; i=i+6)
        {
            if (n%i == 0 || n%(i+2)==0) // If n is divisible with the variable i or i added with 2
            {
                return false; // Return false value
            }
        }
        return true; // Return true value
    } 
    // Function to check if the number is circular 
    // prime or not. 
    static boolean checkCircular(int N) // Boolean to check if the number is cyclic or not
    { 
        // Count digits. 
        int count=0, temp=N; 
        while (temp>0)
        { 
            count++; 
            temp/=10; 
        }
        int num=N; // Assigning the value of N in num variable  
        System.out.println();
        while (isPrime(num)) // If the value assigned in the num variable is prime, while loop iterates
        { 
            // Following three lines generate the next 
            // circular permutation of a number. We 
            // move last digit to first position. 
            int rem=num%10; 
            int div=num/10; 
            num = (int)((Math.pow(10,count-1))*rem)+div;
            System.out.println(num); // Print the new value assigned in variable num
            if (num==N) // When the value of num is equal to the value of N variable
            return true; // Return true
        }
        return false; // Finally return false
    }
    // Driver Program 
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in); // Set scanner class to read input
        System.out.println("Enter a number : ");
        int n=sc.nextInt(); // Read the number
        if (checkCircular(n)) // Check weather the variable n is circular or not
        System.out.println(+n+ " IS A CIRCULAR PRIME."); // If the value of n is circualar, print the value of n and the message
        else // when the value of n is not circular
        System.out.println(+n+ " IS NOT A CIRCULAR PRIME.");  // If the value of n is not circualar, print the value of n and the message
    } 
}