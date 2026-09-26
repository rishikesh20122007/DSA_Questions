class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        long sum = 0;

        for(int num : nums){
            sum = sum + num;
            high = Math.max(high,num);
        }

        if(threshold >= sum) return 1;
        if(threshold == nums.length) return high;

        while(low < high){
            int mid = low + (high - low) / 2;
            if(getdivisor(nums,mid,threshold)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean getdivisor(int nums[], int divisor, int threshold){
        int total = 0;
        for(int num : nums){
            total = total + (num + divisor - 1) / divisor;
            if(total > threshold) {
                return false;
            }
        }
        return (total <= threshold);
    }
}