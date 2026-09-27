class Solution {
    public int totalhours(int[] nums, int hourly){
        int n = nums.length;
        int totalhr  = 0;
        for(int i = 0 ; i < n; i++){
            totalhr += Math.ceil((double)nums[i] / (double)hourly);
        }
        return totalhr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 0;

        for(int pile: piles){
            high = Math.max(high,pile);
        }

        while(low <= high){
            int mid = low + (high -  low) / 2;
            int totalhr = totalhours(piles,mid);
            if(totalhr <= h) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}