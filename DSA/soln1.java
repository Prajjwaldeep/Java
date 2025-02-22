import java.util.Scanner;

public class soln1 {
	public static int sol1(int input[], int x, int startIndex)
    {
        if(startIndex>=input.length)
        {
            return 0;
        }
        if(input[startIndex]==x)
        {
            return startIndex;
        }
        return sol1(input,x,startIndex+1);
    }
    public static int firstIndex(int input[], int x)
    {
        return sol1(input,x,0);
    }
	static Scanner s = new Scanner(System.in);
	
	
	public static int[] takeInput(){
	    System.out.print("Enter size and then array : ");
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		System.out.println("Enter element : ");
		int x = s.nextInt();
		System.out.println(soln1.firstIndex(input, x));
	}
}