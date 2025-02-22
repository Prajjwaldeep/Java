import java.util.*;
public class number_of_subsequence_with_sum_k
{
    public static int subsequence(int ind, int sum, int arr[], int n, List<Integer> ds, int k)
    {
        if(sum>k)
        {
            return 0;
            //Only happens when array elements are positive.
            //Only this base case
        }
        if(ind==n)
        {
            if(sum==k)
            {
                return 1;
            }
            return 0;
        }
        ds.add(arr[ind]);
        sum+=arr[ind];
        int left=subsequence(ind+1,sum,arr,n,ds,k);
        sum-=arr[ind];
        ds.remove(ds.size()-1);
        int right=subsequence(ind+1,sum,arr,n,ds,k);
        return left+right;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,k;
        System.out.println("Enter the size of the array : ");
        n=in.nextInt();
        int arr[]=new int[n];
        int i;
        System.out.println("Enter "+n+" elements : ");
        for(i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the sum value : ");
        k=in.nextInt();
        ArrayList<Integer> ds=new ArrayList<>();
        int res=subsequence(0,0,arr,n,ds,k);
        System.out.println(res);
    }
}