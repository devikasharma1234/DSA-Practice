import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        // Hashmap approach
        HashMap<Integer, Integer> map = new HashMap<>();

        // storing freq of each number
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // find the number that appear only once
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}