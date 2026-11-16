class Solution {
    public int lengthOfLastWord(String s) {
        int n  = s.length();

        int count = 0;

        int i = n - 1;

        //remove trailing space
        while(s.charAt(i) == ' ' && i >= 0){
            i--;
        }
        
        //first make a check on single char  -> S = 'a';
        // and count on the word from last side 
        while( i >= 0 && s.charAt(i) != ' ' ){
            count++;
            i--;
        }

        return count;
    }
}