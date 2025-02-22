import java.util.*;
public class Merge_sort_1
{
    public static void mergeSort(int[] input)
    {
        int i,j,l=input.length,mid=l/2;
        int part1[]=new int[mid];
        int part2[]=new int[l-mid];
        if(l<=1)
        {
            return;
        }
        for(i=0; i<mid; i++)
        {
            part1[i]=input[i];
        }
        int k=0;
        for(i=mid; i<l; i++)
        {
            part2[k]=input[i];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(input,part1,part2);
    }
    public static void merge(int[] input, int[] part1, int[] part2)
    {
        int i=0,j=0,k=0;
        while(i<part1.length && j<part2.length)
        {
            if(part1[i]<part2[j])
            {
                input[k]=part1[i];
                k++;
                i++;
            }
            else
            {
                input[k]=part2[j];
                j++;
                k++;
            }
        }
        while(i<part1.length)
        {
            input[k]=part1[i];
            i++;
            k++;
        }
        while(j<part2.length)
        {
            input[k]=part2[j];
            j++;
            k++;
        }
    }
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] input = takeInput();
		Merge_sort_1.mergeSort(input);
		printArray(input);
	}
}