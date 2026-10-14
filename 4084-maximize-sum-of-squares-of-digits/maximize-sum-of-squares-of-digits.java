class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder result = new StringBuilder();
        int r = sum % 9;

        if( sum > 9 * num) return "";

        int noofnine =  sum / 9;

        for(int i = 0; i < noofnine; i++){
            result.append('9');

        }
        if( r > 0) result.append((char) ('0' + r));

        int zero = num - result.length();

        for(int i = 0; i < zero; i++)  result.append('0');

        return result.toString();
    }
}