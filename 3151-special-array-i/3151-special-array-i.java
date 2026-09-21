class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;
        int first = 0;
        int second = 1;

        for(int i=0; i<nums.length-1; i++){
            if(!((nums[first]%2 == 0 && nums[second]%2 != 0) || (nums[first] %2 != 0 && nums[second]%2 == 0))){
                return false;
            }
            first++;
            second++;
        }
        return true;
    }
}