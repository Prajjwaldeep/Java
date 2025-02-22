import java.util.Scanner;

public class Runner_1 {
    public static void print(int n){
		if(n==0)
		return;
		else
		print(n-1);
		System.out.print(n+" ");
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Value of n : ");
		int n = s.nextInt();
		print(n);
	}
	
}