class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        int n = nums.size();

        //claculate first sum
        int prefix[] = new int[n + 1];

        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        //chk all possible combination of arrays

        for(int i = 0; i < n; i++){
            for(int j = i + l; j <= Math.min(n, i + r); j++){

                //calculte combination of array sum
                int sum = prefix[j] - prefix[i];

                //as we need mininum sum minimum
                if(sum > 0){
                    ans = Math.min(ans , sum);
                }
            }
        }

        //no positive sum found

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}