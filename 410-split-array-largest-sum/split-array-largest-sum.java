class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = 0;
        int hi = 0;

        for(int n : nums){
            lo = Math.max(lo,n);
            hi = hi + n;
        }
        int ans =  0;
        while(lo <= hi){
            
            int mid = lo + ( hi - lo ) / 2;
            if(split(nums,k,mid)){
                ans = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
    }

    private boolean split(int nums[], int k, int maxallow){
        int subarr = 1;
        int currentsum = 0;

        for(int n : nums){
            if(currentsum + n > maxallow){
                subarr++;
                currentsum = n;
                if(subarr > k) return false;

            }
            else{
                currentsum = currentsum + n;
            }
        }
        return subarr <= k;

    }
}