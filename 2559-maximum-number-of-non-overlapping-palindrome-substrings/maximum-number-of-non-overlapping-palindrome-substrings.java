class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        boolean[][] palindrome = new boolean[n][n];

        for(int i = 1; i <= n; i++){
            for(int j = 0; j + i <= n; j++){
                int l = i + j - 1;
                palindrome[j][l] = s.charAt(j) == s.charAt(l) &&
                (i <= 2 || palindrome[j +1][l - 1]);
            }
        }

        int ans[] = new int[n + 1];
        for(int i = 1; i <= n; i++){
            ans[i] = ans[i-1];
            for(int j = 0; j + k <= i; j++){
                if(palindrome[j][i-1]) {
                    ans[i] = Math.max(ans[i], ans[j] + 1);
                }
            }
        }
        return ans[n];
    }
}