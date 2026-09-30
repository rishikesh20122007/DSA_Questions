class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean appear[] = new boolean[26];
        for(char c : sentence.toCharArray()){
            appear[c - 'a'] = true;
        }


        for(boolean b : appear) { 
            if(!b) return false;
        }
        return true;
    }
}