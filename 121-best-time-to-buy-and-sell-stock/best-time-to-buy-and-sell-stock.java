class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int minimum = Integer.MAX_VALUE;
        int maximum = 0;

        for (int price:prices){
            if(price < minimum){
                minimum = price;
            }
            else{
                maximum = Math.max(maximum,price - minimum);
            }
        }
        return maximum;
    }
}