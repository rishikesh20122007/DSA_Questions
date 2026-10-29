class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = n - 1;

        while(i >= 0){
            //removing all trailing space
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            if(i < 0){
                break;
            }
            int j = i;
            //find the start index  of the word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }   // as we get space , it get stoped
            // append this word in answer
            ans.append(s.substring(j + 1 , i + 1));
            //remove unnecessary space where j is ending add a space
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            } // j < 0  -- > no space
            // j >= 0 --> space needed

            if(j >= 0){
                ans.append(' ');
            }
            i = j;
        }
        return ans.toString();

    }
}