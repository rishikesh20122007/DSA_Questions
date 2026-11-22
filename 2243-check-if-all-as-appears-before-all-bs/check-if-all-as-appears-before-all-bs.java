class Solution {
    public boolean checkString(String s) {
       int n = s.length();
        //Approach - 1
        //check the negation of availability
        //return !s.contains("ba");

        // Approach - 2
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         if(s.charAt(i) == 'b' && s.charAt(j) == 'a'){
        //             return false;
        //         }
        //     }
        // }
        // return true;

        //Approach - 3
        int alast = -1;   // index of last occurance of 'a'
        int bfirst = n;   //index of firt occurance of b

        for(int i = 0 ; i < n; i++){
            if(s.charAt(i) == 'a'){
                alast = Math.max(alast , i);
            }
            else{
                bfirst = Math.min(bfirst , i);
            }
        }
        return alast < bfirst;
    }
}