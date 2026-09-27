class Solution {
    private static void swap(int[] nums, int a, int b) {
       int temp = nums[a];
       nums[a] = nums[b];
       nums[b] = temp;
   }
    public void sortColors(int[] nums) {
        // if mid = 0 -> swap mid with low
        // if mid = 2 -> swap mid with high
        // if mid = 1 -> increment mid
        // 1 will get in the right position apne aap

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                // move 0 to beginning
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                // leave 1 in place
                mid++;
            }
            else{
                // move 2 to the end
                swap(nums, mid, high);
                high--;
            }
        }
        
    }
}