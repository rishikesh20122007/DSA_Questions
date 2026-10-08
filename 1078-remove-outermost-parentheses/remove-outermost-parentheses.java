class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder answer = new StringBuilder();
        int n = s.length(), level = 0;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if( c == ')') level--;

            if(level > 0){
                answer.append(c);
            }

            if(c == '(') level++;
        }
        return answer.toString();
    }
}