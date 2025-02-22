
public class BinarySearch {
	
	public static void main(String[] args) {
		
		BinarySearch bs=new BinarySearch();
		
		int arr[]= {1,3,4,6,7,8,9};
		int ns=9;
		if(bs.searchElement(arr, arr.length, ns)!=-1)
		{
			System.out.println("Item found at location: "+bs.searchElement(arr, arr.length, ns));
		}
		else
		{
			System.out.println(bs.searchElement(arr, arr.length, ns));
			System.out.println("Item not found!");
		}
		
	}
	
	public int searchElement(int arr[],int len,int ns)
	{
		
		int low=0;
		int high=len-1;
		while(low <= high)
		{
			int mid=(low+high)/2;
			if(ns==arr[mid])
			{
				return mid+1;
			}
			else
			{
				if(ns>arr[mid])
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return -1;
	}
	
}
