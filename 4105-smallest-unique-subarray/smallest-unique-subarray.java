class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        long base = 911382323L;
        long mod = 1000000007L;
        int n = nums.length;
        long h[] = new long[n + 1];
        long p[] = new long[n + 1];
       
        p[0] = 1;

        for(int i = 0; i < n; ++i){
            h[i + 1] = (h[i] * base + nums[i]) % mod;
            p[i + 1] = (p[i] * base) % mod;
        }
        //implementing binary search
        int low = 1;
        int high = n;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(solve(mid , n , h, p , mod)){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean solve(int len , int n , long[] h , long[] p, long mod){
        Map<Long , Integer> count = new HashMap<>();

        for(int l = 0; l + len <= n; ++l){
            int r = l + len;
            long key = (h[r] -((h[l] * p[len]) % mod) + mod) % mod;
            count.merge(key , 1 , Integer::sum);
        }

        for(int times : count.values()){
            if(times == 1) return true;
        }

        return false;
    }
}