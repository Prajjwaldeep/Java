import java.util.*;
public class subsequence_of_an_array
{
    public static void generate_subsequences(int n, int arr[], List<Integer> ds, List<List<Integer>>ans, int ind)
    {
        if(ind==n)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        generate_subsequences(n,arr,ds,ans,ind+1);
        ds.remove(ds.size()-1);
        generate_subsequences(n,arr,ds,ans,ind+1);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.print("Enter the size of the array : ");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array :");
        for(i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        generate_subsequences(n,arr,ds,ans,0);
        for (List a : ans)
        {
            System.out.println(a);
        }
    }
}