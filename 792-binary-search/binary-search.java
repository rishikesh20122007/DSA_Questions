class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        //solving using recursive function

        int ans = solve(nums , s , e , target);
        return ans;
    }

    private int solve(int[] arr , int s , int e , int target){
        //base case
        if(s > e){
            return -1;
        }
        //processing
        int mid = s + ( e - s ) / 2;

        if(arr[mid] == target){
            return  mid; 
        }

        if(arr[mid] > target){
            // e = mid - 1;
            return solve(arr , s , mid - 1, target);
        }
        else{
            // s = mid + 1;
            return solve(arr , mid + 1 , e, target);
        }
       
    
        
    }
}