import java.util.HashMap;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int result = -1;

        // 1. Count frequencies of even numbers
        for (int num : nums) {
            if(num % 2 != 0) continue;

            int count = map.getOrDefault(num, 0)+1;
            map.put(num, count);

            if(count > maxFreq || (count == maxFreq && num < result)){
                maxFreq = count;
                result = num;
            }
        }
        return result;
    }
}