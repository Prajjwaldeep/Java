/* Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30 */
import java.util.*;
public class combination_sum_II
{
    public static void generate_combos(int arr[], List<Integer> ds, List<List<Integer>>ans, int ind, int target)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        int i;
        for(i=ind; i<arr.length; i++)
        {
            if(i>ind && arr[i]==arr[i-1])
            {
                continue;
            }
            if(arr[i]>target)
            {
                break;
            }
            ds.add(arr[i]);
            generate_combos(arr,ds,ans,i+1,target-arr[i]);
            ds.remove(ds.size()-1);
        }
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
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        System.out.println("Enter target : ");
        int target=in.nextInt();
        generate_combos(arr,new ArrayList<>(),ans,0,target);
        for (List a : ans)
        {
            System.out.println(a);
        }
    }
}