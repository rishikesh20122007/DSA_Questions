class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

        int start = 1;
        int end = x/2;    // sqrt of a number is always less than half of that number 
        int ans = 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid <= x / mid){     //mid * mid <= x
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}