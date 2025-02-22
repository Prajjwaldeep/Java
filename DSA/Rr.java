import java.util.Scanner;

public class Rr {
	public static int[] Indexes(int input[], int x,int indx, int fsf) {
	    int l=input.length;
        int arr[];
        if(indx==l)
        {
            return new int[fsf];
        }
        if(input[indx]==x)
        {
            arr=Indexes(input,x,indx+1,fsf+1);
        	arr[fsf]=indx;
        	return arr;
        }
        arr=Indexes(input,x,indx+1,fsf);
        return arr;
        
}
	static Scanner s = new Scanner(System.in);
	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return Indexes(input,x,0,0);
		
	}
	public static int[] takeInput(){
		System.out.println("Size : ");
	    int size = s.nextInt();
		int[] input = new int[size];
		System.out.println("Elements : ");
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		System.out.println("To be found element : ");
		int x = s.nextInt();
		int output[] = allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}