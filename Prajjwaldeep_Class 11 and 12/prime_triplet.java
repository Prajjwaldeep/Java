import java.util.*;
public class prime_triplet
{
    // function to detect prime number
    //Sieve methord of finding the prime numbers
    static void sieve(int n, boolean prime[])
    {
        // If prime[p] is not changed, then it will be a prime.
        for (int p=2; p*p<=n; p++)
        {
            if (prime[p]==true)
            {
                // Update all multiples of p
                for (int i=p*2; i<=n; i=i+p)
                prime[i]=false;
            }
        }
    }
    // funcion to detect and print prime triplets
    static void printPrimeTriplets(int n)
    {
        // Finding all primes from 1 to n
        boolean prime[]=new boolean[n+1];
        Arrays.fill(prime,true);
        sieve(n,prime);
        System.out.println("The prime triplets from 1 to "+n+" are : ");
        for (int i=2; i<(n-6); i++)
        {
            // triplets of p,(p+2),(p+6)
            if (prime[i] && prime[i+2] && prime[i+6])
            System.out.println(i+" "+(i+2)+" "+(i+6));
            // triplets to form p,(p+4),(p+6)
            if (prime[i] && prime[i+4] && prime[i+6])
            System.out.println(i+" "+(i+4)+" "+(i+6));
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit until which you want to find the prime triplets : ");
        int n=in.nextInt();
        printPrimeTriplets(n);
    }
}