import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		Array array=new Array();
		
		int arr[]= {1,0,2,0,3};
		
		System.out.println(Arrays.toString(arr));
		
		//array.reverseArray(arr);
		
		//array.findMinElement(arr);
		
		array.moveZeroesAtEnd(arr,arr.length);
		
	}
	
	public void swap(int arr[],int start,int end)
	{
		arr[end]=arr[start] + arr[end] - (arr[start] = arr[end]);
	}
	
	public void reverseArray(int arr[])
	{
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{			
			swap(arr,start,end);
			start++;
			end--;
		}
//		for(start=0;start<arr.length;start++)
//		{
//			System.out.println(arr[start]);
//		}
		
//		StringBuffer sbf=new StringBuffer(Arrays.toString(arr));
//		sbf.reverse();
//		
//		System.out.println(sbf);
		
		//System.out.println(Arrays.toString(arr));
		
		
	}
	
	public void findMinElement(int arr[])
	{
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min element is: "+min);
	}
	
	public void moveZeroesAtEnd(int arr[],int n)
	{
		
		int i,j=0;
		for(i=0;i<n;i++)
		{
			
			if(arr[i]!=0 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0)
			{
				j++;
			}
		}
		
//		for(i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
		System.out.println("After moving zeroes at end:");
		System.out.println(Arrays.toString(arr));
	}

}
