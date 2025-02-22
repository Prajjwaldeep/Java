import java.util.Scanner;

public class found_or_not {
    
    static Scanner s = new Scanner(System.in);
    public static boolean answer(int arr[], int x, int si) {
        if(si>=arr.length)
        {
            return false;
        }
        if(arr[si]==x)
        {
            return true;
        }
        else
        {
            return answer(arr,x,si+1);
        }
    }
    public static boolean checkNumber(int input[], int x) {
        return answer(input,x,0);
	}
    public static void main(String[] args) {
        
	    System.out.println("Size : ");
        int n = s.nextInt();
		System.out.println("Elements : ");
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println("Enter the value of x : ");
        int x = s.nextInt();
        System.out.println(checkNumber(input, x));
    }
}
