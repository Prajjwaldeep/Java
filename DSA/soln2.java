import java.util.Scanner;
public class soln2
{
    static Scanner s = new Scanner(System.in);
    public static int enIndex(int[] input, int x, int endIndex)
	{
	    if(endIndex<0)
	    return 0;
	    if(input[endIndex]==x)
	    {
	        return endIndex;
	       }
	       return enIndex(input,x,endIndex-1);
	}
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
		System.out.println(soln2.enIndex(input, x, input.length-1));
	}
}