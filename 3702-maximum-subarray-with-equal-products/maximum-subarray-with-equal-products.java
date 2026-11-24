class Solution {
    public int maxLength(int[] nums) {
       int ans = 2;
       int x = 1;
       
       int n = nums.length;
       int start = 0;
       int end = 0;

        while(end < n){
            while(gcd(x , nums[end]) > 1){
                x /= nums[start++];
            }
            x *= nums[end];
            ans = Math.max(ans , end - start + 1);
            end++;
        } 

       return ans;
    }

    private int gcd(int num1 , int num2){
        while(num2 != 0 ){
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }
}