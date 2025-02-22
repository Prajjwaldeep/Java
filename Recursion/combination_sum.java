/* Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 

Constraints:

1 <= candidates.length <= 30
1 <= candidates[i] <= 200
All elements of candidates are distinct.
1 <= target <= 500 */
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
public class combination_sum
{
    public static void find_combos(int arr[], int target, List<Integer>ds, List<List<Integer>> ans,int ind)
    {
        if(ind==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target)
        {
            ds.add(arr[ind]);
            find_combos(arr,target-arr[ind],ds,ans,ind);
            ds.remove(ds.size()-1);
        }
        find_combos(arr,target-arr[ind],ds,ans,ind+1);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        find_combos(candidates, target, ds, ans,0);
        return ans;
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
        ans=combinationSum(arr,target);
        for (List a : ans)
        {
            System.out.println(a);
        }
    }
}