import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner in=new Scanner(System.in);
		int l,n=0,t=0,i;
		String str;
		char ch;
		System.out.println("Length : ");
		l=in.nextInt();
		System.out.println("String : ");
		str=in.next();
		for(i=0; i<l; i++)
		{
			ch=str.charAt(i);
			if(ch=='N')
			{
				n++;
			}
			else
			{
				t++;
			}
		}
		if(n>t)
		{
			System.out.println("Nutan");
		}
		else
		{
			System.out.println("Tusla");
		}

	}
}
