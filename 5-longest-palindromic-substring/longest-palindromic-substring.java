class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
         
        int start = 0;
        int end = 0;

        for(int i = 0 ; i < n; i++){
            //odd string palindrome
            int len1 = expand(s, i , i);

            //Even length palindrome 
            int len2 = expand(s, i , i + 1);

            //finding max langth
            int length = Math.max(len1 , len2);

            if(length > end - start + 1){       //Update starting and ending index
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }

        return s.substring(start , end + 1);
        
    }

    //expanding around the center 

    public int expand(String s , int left , int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){

            right++;
            left--;
        }

        return right - left - 1;
    }
}