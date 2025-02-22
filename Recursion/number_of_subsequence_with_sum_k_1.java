import java.util.*;
public class number_of_subsequence_with_sum_k_1
{
    public static void subsequence(int ind, int sum, int arr[], int n, List<Integer> ds, int k )
    {
        if(ind==arr.length)
        {
            if(sum==k)
            {
                for(Integer i : ds)
                {
                    System.out.print(i+" ");
                    
                }
                System.out.println();
            }
            return;
        }
        ds.add(arr[ind]);
        sum+=arr[ind];
        subsequence(ind+1,  sum,  arr,  n, ds,  k);
        ds.remove(ds.size()-1);
        sum-=arr[ind];
        subsequence(ind+1,  sum,  arr,  n, ds,  k);
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
        subsequence(0,0,arr,n,ds,k);
    }
}