class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st = new StringBuilder();
        int ptr1 = 0;
        int ptr2 = 0;
        
        while(ptr1 < word1.length() || ptr2 < word2.length()){
            if(ptr1 < word1.length()){
                st.append(word1.charAt(ptr1));
                ptr1++;
            }
            if(ptr2 < word2.length()){
                st.append(word2.charAt(ptr2));
                ptr2++;
            }
        }
        return st.toString();    
    }
}