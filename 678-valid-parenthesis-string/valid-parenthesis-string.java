class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n + 1][n + 1];
        dp[n][0] = true;   //emptpty string with zero opening bracket is valid 

        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j < n; j++){        // j -> openbracket 
                boolean validity = false;
                if(s.charAt(i) == '*'){
                    validity |= dp[i + 1][j + 1];   //trying star as (
                    if(j > 0){
                        validity |= dp[i + 1][j - 1];   // trying star s )
                    }

                    validity |= dp[i + 1][j];   // ignoring *
                }
                else{     // iif character is not star then it can be ( or ).
                    if(s.charAt(i) == '('){
                        validity |= dp[i + 1][j + 1];    // trying (
                    }
                    else if (j > 0){
                        validity |= dp[i + 1][j - 1];   // trying )
                    }
                }
                dp[i][j] = validity;
            }
        }
        return dp[0][0];
    }
}