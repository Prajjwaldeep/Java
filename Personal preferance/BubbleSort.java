import java.util.Arrays;

public class BubbleSort {
	
	int arr[]= {5,6,4,1,3,9,7};
	int n=arr.length;
	
	public static void main(String[] args) {
		
		BubbleSort bs=new BubbleSort();
		
		bs.performBubbleSort();
		
		bs.printArray();
		
	}
	
	public void performBubbleSort()
	{
		
		boolean isSwapped=false;
		for(int i=0;i<n-1;i++)
		{
			isSwapped=false;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					arr[j+1] = arr[j] + arr[j+1] - (arr[j] = arr[j+1]);
					isSwapped=true;
				}
			}
			if(isSwapped==false)
			{
				break;
			}
		}
	}
	
	public void printArray()
	{
		System.out.println(Arrays.toString(arr));
	}

}
