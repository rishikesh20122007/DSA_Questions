class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char maximum = 'a',
             minimum = 'z';
        boolean sorted = true;
        for(int i = 0; i < n; i++){
            maximum = (char) Math.max(maximum, s.charAt(i));
            minimum = (char) Math.min(minimum, s.charAt(i));
            if( i > 0 && s.charAt(i - 1) > s.charAt(i))  sorted = false;
            
        }
        if(sorted) return 0;
        if(n == 2) return -1 ;
        if(s.charAt(0) == minimum || s.charAt(n - 1) == maximum) return 1;

        for(int i = 1 ; i < n - 1; i++) {
            if(s.charAt(i) == minimum || s.charAt(i) == maximum) return 2;
        }

        return 3;
    }
}