class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = nums1[0];
        int min2 = nums2[0];

        for(int num : nums1){
            min1 = Math.min(num, min1);
        }

        for(int num : nums2){
            min2 = Math.min(num, min2);
        }

        return min2 - min1;
    }
}