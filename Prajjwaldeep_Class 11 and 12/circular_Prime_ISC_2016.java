import java.util.Scanner;
class circular_Prime_ISC_2016
{
    boolean prime(int n)
    {
        int c=0;//initializing c as 0
        for(int i=1;i<=n;i++)//checking the inputed number for prime 
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)//when the number is not prime
        return true;
        else
        return false;
    }
    int circulate(int n)//ciculating the inputed number
    {
        String s=Integer.toString(n);//converting the inputed number to string
        String p=s.substring(1)+s.charAt(0);//adding the last character at first
        int k=Integer.parseInt(p);//converting the circulated string to integer
        return(k);//returning the circulated integer
    }
    void check_circularprime(int n)//checking for circular prime number
    {
        int t=0;
        int k=n;
        do
        {
            System.out.println(k);
            if(prime(k)==false)//checking the function prime to be false 
            {
                t=1;
                break;
            }
            k=circulate(k);
        }
        while(k!=n);
        if(t==1)//when the number is prime
        System.out.println("Hence "+n+" is not a circular_prime number");
        else
        System.out.println("Hence "+n+" is a circular_prime number");
    }
    public static void main(String args[])//writing main method
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");//taking input
        int n=in.nextInt();
        circular_Prime_ISC_2016 ob=new circular_Prime_ISC_2016();//creating object 'ob'
        ob.check_circularprime(n);//calling the function check_circularprime
    }
}

        
    
        
        
            
            
        