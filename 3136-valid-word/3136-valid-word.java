class Solution {
    public boolean isValid(String word) {
        // char[] ch =word.toCharArray();
        if(word.length ()<3) return false;
        boolean v =false;
        boolean c=false;
        for (int i = 0; i < word.length(); i++) {
            char s = word.charAt(i);
            if (!((s >= 'A' && s <= 'Z') ||
          (s >= 'a' && s <= 'z') ||
          (s >= '0' && s <= '9')))  {
                return false;
            }
            if(s =='a' || s== 'e' ||s =='i' ||s=='o' ||s=='u'||s =='A' || s== 'E' ||s =='I' ||s=='O' ||s=='U'){
                v=true;
            }
            else if((s>= 'a' && s<='z') ||(s>='A' && s<='Z')){
                c=true;
            }

        }
        return v && c;
    }

}