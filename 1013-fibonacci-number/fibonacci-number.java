class Solution {
    public int fib(int n) {
        //---> 1st approach----
        // //base case
        // if(n == 0){
        //     return 0;
        // }

        // if(n == 1){
        //     return 1;
        // }

        // //recursive relation
        // int answer  = fib(n - 1) + fib(n - 2);
        // return answer;

        //---> 2nd approach------
        if( n <= 1 ) {
            return n;
        }

        return fib(n - 2) + fib(n - 1);

        //---> 3rd approach---------
        //base case
        // if(n == 0 & n == 1){
        //     return n;
        // }

        // //recursive relation
        // int f1 = fib(n - 1);
        // int f2 = fib(n - 2);

        // int ans = f1 + f2;

        // return ans;

    }
}