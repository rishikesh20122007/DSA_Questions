class Solution {

    public void backtrack(List<String> ans, String s,int op,int cl , int n){
        if(s.length() == 2 * n){
            ans.add(s);
            return;
        }
         
        if(op < n){
            backtrack(ans, s + "(", op + 1, cl , n);
        }

        if(cl < op){
            backtrack(ans, s + ")", op, cl + 1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        backtrack(answer, "" ,0,0,n);
        return answer;
    }
}