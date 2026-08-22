class Solution {
    public boolean checkDivisibility(int n) {
        int digitsum = 0;
        int digitproduct = 1;
        int original = n;     

        while (n>0){    // don't use n > 1   it will provide you error in some test ccases 
            int temp = n % 10;
            n = n / 10;

            digitsum += temp;
            digitproduct *= temp;
        }
        return original % (digitsum + digitproduct) == 0;
    }
}