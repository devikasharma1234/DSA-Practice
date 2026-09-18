import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // Step 1: frequency array
            int[] freq = new int[26];

            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int count : freq) {
                    key.append('#').append(count);
                }

                // Add string to its anagram group
                map.computeIfAbsent(key.toString(),
                        k -> new ArrayList<>()).add(str);
            }

            return new ArrayList<>(map.values());
    }
}