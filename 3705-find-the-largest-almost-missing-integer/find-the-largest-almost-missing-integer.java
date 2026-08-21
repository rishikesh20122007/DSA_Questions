class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(n == k){
            int result = nums[0];
            for(int x : nums){
                result = Math.max(result, x);
            }
            return result;
        }
        int count[] = new int[51];
        for(int x: nums){
            count[x]++;
        }
        if(k == 1){
            for(int i = 50; i >= 0; --i){
                if(count[i] == 1){
                    return i;
                }
            }
            return -1;
        }
        int result = -1;
        if(count[nums[0]] == 1){
            result = Math.max(result, nums[0]);
        }
        if(count[nums[n -1]] == 1){
            result = Math.max(result, nums[n-1]);
        }


        return result;
    }
}