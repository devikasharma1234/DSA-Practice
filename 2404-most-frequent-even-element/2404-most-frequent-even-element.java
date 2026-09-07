class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] freq = new int[100001];
        int count = 0;
        int candidate = -1;
        for(int num : nums) {
            if(num  % 2 == 0) {
                freq[num]++;            }
        }
        for(int num : nums) {
            if(num%2==0) {
                if(freq[num] > count) {
                    count = freq[num];
                    candidate = num;
                }
                else if(freq[num] == count && num < candidate) {
                    candidate = num;
                }
            }
        }
        return candidate;

    }
}