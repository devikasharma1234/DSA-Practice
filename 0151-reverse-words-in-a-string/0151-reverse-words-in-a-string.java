class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        // traverse and extract words
        for(char c : s.toCharArray()){
            if(c != ' '){
                word.append(c);
            }
            else if(word.length() > 0){
                words.add(word.toString());
                word.setLength(0);
            }
        }

        // add the last word if any
        if(word.length() > 0){
            words.add(word.toString());
        }

        // reverse the list
        Collections.reverse(words);

        return String.join(" ", words);
    }
}