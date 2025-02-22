import java.util.*;
public class array_subs
{
    public static void generate_subsequences(int ind, int arr[], int n, List<Integer> ds, List<List<Integer>> ans)
    {
        if(ind==n)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        generate_subsequences(ind+1,arr,n,ds,ans);
        ds.remove(ds.size()-1);
        generate_subsequences(ind+1,arr,n,ds,ans);
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
        List<List<Integer>> ans=new ArrayList<>();
        generate_subsequences(0,arr,n,new ArrayList<>(), ans);
        for(List a : ans)
        {
            System.out.println(a);
        }
    }
}