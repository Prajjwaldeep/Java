import java.util.*;
public class subs
{
    public static void subsequences(int ind, int arr[], List<Integer> ds, List<List<Integer>> ans)
    {
        if(ind==arr.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        subsequences(ind+1,arr,ds,ans);
        ds.remove(ds.size()-1);
        subsequences(ind+1,arr,ds,ans);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        subsequences(0,arr,new ArrayList<>(), ans);
        System.out.println(ans);
    }
}