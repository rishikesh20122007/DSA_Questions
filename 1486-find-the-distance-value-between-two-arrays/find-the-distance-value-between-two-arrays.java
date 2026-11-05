class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;

        for(int i : arr1){
            boolean accept = true;
            for(int j : arr2){
                accept &= Math.abs(i - j)  > d;
            }
            count += accept ? 1 : 0;
        }
        return  count;
    }
}