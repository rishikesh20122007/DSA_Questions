class Solution {
    public long countCommas(long n) {
        long a = 1000, result = 0;
        while(a <= n) {
            result = result +  n - a + 1;
            a = a * 1000;
        }
        return result;
    }
}