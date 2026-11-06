class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();

        StringBuilder answer = new StringBuilder();
       
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

             int m = answer.length();
            //compare answer with right most character to current character
            if(m > 0 && answer.charAt(m - 1) == ch){
                answer.deleteCharAt(m - 1);
            }
            else{
                //if these two are different character  the append the answer
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}