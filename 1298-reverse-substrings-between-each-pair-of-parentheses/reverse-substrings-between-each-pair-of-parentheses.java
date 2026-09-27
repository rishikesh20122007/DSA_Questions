class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> openparenthesis = new Stack<>();
        int pair[] = new int[n];

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '(') openparenthesis.push(i);
            if(s.charAt(i) == ')'){
                int j = openparenthesis.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int index = 0,direction = 1 ; index < n; index +=direction){
            if(s.charAt(index) == '(' || s.charAt(index) == ')'){
                index = pair[index];
                direction = -direction;
            } 
            else result.append(s.charAt(index));

        }
        return result.toString();
    }
}