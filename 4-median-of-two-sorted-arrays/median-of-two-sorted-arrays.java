class Solution {
    public int p2 = 0, p1 = 0;
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if((n + m) % 2 == 0){
        for(int i = 0; i < (n + m)/ 2 - 1; i++){
            int temp = getmin(nums1,nums2);
        }
        return (double)(getmin(nums1 , nums2) + getmin(nums1,nums2)) / 2;
        }
        else {
            for(int i = 0; i < (n + m)/2; i++){
                int temp = getmin(nums1,nums2);
            }
            return getmin(nums1,nums2);
        }
    }

    public int getmin(int nums1[], int nums2[]){
        int n = nums1.length;
        int m = nums2.length;
        if(p1 < nums1.length && p2 < nums2.length){
            return nums1[p1] < nums2[p2] ? nums1[p1++]: nums2[p2++];
        }
        else if(p1 < n){
            return nums1[p1++];
        }
        else if(p2 < m){
            return nums2[p2++];
        }
        return -1;
    }
}