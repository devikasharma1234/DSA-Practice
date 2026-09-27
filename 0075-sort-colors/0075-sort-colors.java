class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int i=-1;
        
        // moving all 0's to beginning
        for(int j=0; j<n; j++){
            if(nums[j] == 0){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int k=i+1;

        // moving all 1's next to 0's
        for(int j=k; j<n; j++){
            if(nums[j] == 1){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
}