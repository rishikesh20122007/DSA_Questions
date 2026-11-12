class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int n = nums.length;

        //TRACK THE  length of increasing and decresasing sequences
        int increase = 1 , decrease = 1;
        int maxlength = 1;

        //iterate through array comparing adjacant element
        for(int i = 0; i < n - 1; i++){
            if(nums[i + 1] > nums[i]){
                //next element is larger -> extend increasing sequence
                increase++;
                decrease = 1; // reset decreasing
            }
            else if(nums[i + 1] < nums[i]){
                //next element is smaller ->, extend decreasing sequence
                decrease++;
                increase = 1; // reset increasing
            }
            else{
                //next element are equal -> reset both condintion
                increase = 1;
                decrease = 1;
            }

            //updating the length considering both sequence
            maxlength = Math.max(maxlength , Math.max(increase , decrease));

        } 

        return maxlength;
    }
}