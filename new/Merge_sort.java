import java.util.*;
public class Merge_sort
{
    public static void mergeSort(int[] input)
    {
        if(input.length<=1)
        {
            return;
        }
        int mid=input.length/2,i;
        int arr1[]=new int[mid];
        int arr2[]=new int[input.length-mid];
        for(i=0; i<mid; i++)
        {
            arr1[i]=input[i];
        }
        int k=0;
        for(i=mid; i<input.length; i++)
        {
            arr2[k]=input[i];
            k++;
        }
        mergeSort(arr1);
        mergeSort(arr2);
        merge(input,arr1,arr2);
    }
    private static void merge(int[] input,int arr1[],int arr2[])
    {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                input[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
                input[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length)
        {
            input[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length)
        {
            input[k]=arr2[j];
            k++;
            j++;
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
		Merge_sort.mergeSort(input);
		printArray(input);
	}
}