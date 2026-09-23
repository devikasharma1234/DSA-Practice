import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        // xor operator - xor with same number gives 0 -> 1^1 = 0, so the left number will be the single frequency number after doing xor on all numbers

        int xr = 0;

        for(int num : nums){
            xr = xr^num;
        }
        return xr;
    }
}