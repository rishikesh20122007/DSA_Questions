// class Solution {
//     public int reverseDegree(String s) {
//         int n = s.length();
//         int ans = 0;
//         for(int i = 0 ; i <= n; i++){
//             answer += (26 - (s.charAt(i - 1) - 'a')) * i;
//         }
//         return answer;
//     }
// }

class Solution {

    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 1; i <= s.length(); i++) {
            ans+= (26 - (s.charAt(i - 1) - 'a')) * i;
        }
        return ans;
    }
}