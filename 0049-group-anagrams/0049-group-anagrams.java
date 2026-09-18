import java.util.*;

class Solution {

    static class TrieNode {

        Map<String, TrieNode> children = new HashMap<>();

        List<String> words = new ArrayList<>();
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        TrieNode root = new TrieNode();

        // Insert every string into Trie
        for (String str : strs) {

            // Step 1: frequency array
            int[] freq = new int[26];

            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            // Step 2: traverse Trie
            TrieNode curr = root;

            for (int i = 0; i < 26; i++) {

                String key = i + "#" + freq[i];

                if (!curr.children.containsKey(key)) {
                    curr.children.put(key, new TrieNode());
                }

                curr = curr.children.get(key);
            }

            // Step 3: store string at terminal node
            curr.words.add(str);
        }

        // Step 4: collect all groups
        List<List<String>> result = new ArrayList<>();

        collect(root, result);

        return result;
    }

    private void collect(
        TrieNode node,
        List<List<String>> result
    ) {

        // If this node represents an anagram group
        if (!node.words.isEmpty()) {
            result.add(node.words);
        }

        // Visit children
        for (TrieNode child : node.children.values()) {
            collect(child, result);
        }
    }
}