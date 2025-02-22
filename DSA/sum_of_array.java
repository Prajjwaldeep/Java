import java.util.Scanner;
public class sum_of_array
 {
    public static int sum(int input[], int startIndex)
    {
        if(startIndex>=input.length)
        {
            return 0;
        }
        else
        {
            return input[startIndex]+sum(input,startIndex+1);
        }
    }
    
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
	    System.out.println("Size : ");
		int n = s.nextInt();
		System.out.println("Elements : ");
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input,0));
	}
}
