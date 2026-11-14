class Solution {
    public int fib(int n) {
        
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

        if( n <= 1 ) {
            return n;
        }

        return fib(n - 2) + fib(n - 1);
    }
}