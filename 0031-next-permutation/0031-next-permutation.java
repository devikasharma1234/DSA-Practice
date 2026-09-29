class Solution {
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // step1: find the pivot element
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        // step 2: find the right most element greater than pivot element
        if (pivot != -1) { // If such an element is found
            for(int i=n-1; i>pivot; i--){
                if(nums[i] > nums[pivot]){
                    swap(nums, i, pivot);
                    break;
                }
            }
        }

        // step3 : reverse the right part to make inc order
        reverse(nums, pivot+1, n-1);
    }
}