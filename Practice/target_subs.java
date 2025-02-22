import java.util.*;
public class target_subs
{
    public static void generate_combos(int ind, int arr[], int n, List<Integer>ds, List<List<Integer>> ans,int sum,int target)
    {
        if(ind==n)
        {
            if(sum==target)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(arr[ind]);
        sum+=arr[ind];
        generate_combos(ind+1,arr,n,ds,ans,sum,target);
        ds.remove(ds.size()-1);
        sum-=arr[ind];
        generate_combos(ind+1,arr,n,ds,ans,sum,target);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.print("Enter the length of the array : ");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter target : ");
        int target=in.nextInt();
        List<List<Integer>> ans=new ArrayList<>();
        generate_combos(0,arr,n,new ArrayList<>(), ans,0,target);
        for(List a : ans)
        {
            System.out.println(a);
        }
    }
}