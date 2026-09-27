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

// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         int lo = 1;
//         int hi = 0;
//         for(int x : piles){
//             hi = Math.max(hi,x);
//         }
//         while(lo<=hi){
//             int mid = lo + (hi - lo)/2;
//             long hour = 0;
//             for(int x : piles){
//                 hour += (x + mid - 1)/mid;
//             }
//             if(hour <= h){
//                 hi = mid - 1;
//             }
//             else{
//                 lo = mid + 1;
//             }
//         }
//         return lo;
//     }
// }