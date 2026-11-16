class Solution {
    public String digitSum(String s, int k) {

        while(s.length() > k){
            //after each round string will be stored in stringBuilder
            StringBuilder temp = new StringBuilder();
            
            int n = s.length();

            for(int i = 0 ; i < n; i += k){
                int value = 0;
                
                for(int j = i ; j <  Math.min(i + k , n); ++j){
                    value += s.charAt(j) - '0';
                }
                //store the value into temp stringbuilder
                temp.append(value);
            }
            //now store result in string
            s = temp.toString();
        }

        //rerurning output and printing string

        return s;
    }
}