class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int answer = n + 1;
        int sum = 0;

        int  dp[] = new int[n + 1];
        Arrays.fill(dp,n);
        for(int j = 0, i = 0; i < n; i++){
            // int j = 0;
            sum = sum + arr[i];
            while(sum > target){
                sum = sum - arr[j++];
            }
            dp[i + 1] = dp[i];
            if(sum == target){
                answer = Math.min(answer, i - j + 1 + dp[j]);
                dp[i + 1] = Math.min(dp[i], i - j + 1);
            }
        }
        return answer == n + 1 ? -1 : answer;
    }
}