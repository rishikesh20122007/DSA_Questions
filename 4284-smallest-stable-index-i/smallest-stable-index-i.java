class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int minValue = nums[i] , maxValue = nums[i];
            for(int j = i + 1; j < n; j++){
                minValue = Math.min(minValue,nums[j]);
            }
            for(int j = 0; j < i; j++){
                maxValue = Math.max(maxValue,nums[j]);
            }
            if(maxValue - minValue <= k) return i;
        }
        return -1;
    }
}