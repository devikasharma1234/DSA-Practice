import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 2 pointers approach - optimized
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){
            // skip the duplicated for 1st element
            if(i>0 && nums[i] == nums[i-1]) continue;

            int target = -nums[i];
            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicate values
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
}