
public class Bottom_Up_Approach_Fibonacci_Series {
	
	public static void main(String[] args) {
		
		Bottom_Up_Approach_Fibonacci_Series series=new Bottom_Up_Approach_Fibonacci_Series();
		
		int n=5;
		
		System.out.printf("The %dth element is: %d",n,series.fib(n));
		
	}
	
	public int fib(int n)
	{
		int table[]=new int[n];
		
		table[0]=0;
		table[1]=1;
		
		for(int i=2;i<n;i++)
		{
			table[i] = table[i-1] + table[i-2];
		}
		return table[n-1];
	}

}
