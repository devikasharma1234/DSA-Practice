import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 2 pointer and set approach
        int n = nums.length;
        Arrays.sort(nums); // step1 - sort the array
        Set<List<Integer>> set = new HashSet<>(); // step2 - set to store unique triple
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n-2; i++){
            int low = i+1;
            int high = n-1;
            int target = -nums[i];  // b+c = -a

            while(low < high){
                int sum = nums[low] + nums[high];
                if(sum == target){
                    // found a triplet;
                    set.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                }
                else if(sum < target){
                    // needs a bigger sum
                    low++;
                }
                else{
                    // needs a lower sum
                    high--;
                }
            }
        }
        ans.addAll(set);
        return ans;
    }
}