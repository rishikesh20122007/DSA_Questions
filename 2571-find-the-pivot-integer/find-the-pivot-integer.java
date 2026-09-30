class Solution {
    public int pivotInteger(int n) {

        // for(int i = 1; i <= n; i++){
        //     int leftsum = 0;
        //     int rightsum = 0;

        //     for(int j = 1; j <= i; j++){
        //         leftsum += j;
        //     }
        //     for(int k = i; k <= n; k++){
        //         rightsum += k;
        //     }
        //     if(rightsum == leftsum) return i;
        // }
        // return -1;

        int total = n * (n + 1) / 2;

        int x = (int)Math.sqrt(total);

        if(x * x == total) {
            return x;
        }

        return -1;
    }
}