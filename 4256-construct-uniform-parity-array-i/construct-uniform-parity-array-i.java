class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] nums2 = new int[n];
        for(int i = 0 ; i  < n; i++){
            for(int j = n-1 ; j > i; j--){
                if(nums2[i] == nums1[i] && nums2[i] == nums1[i] - nums1[j]){
                    return false;
                }
            }
         
        }
        return true;
    }
}