class Solution {
    public int minChanges(String s) {
        // char currentchar = s.charAt(0);
        // int nextcount = 0;
        // int changerequired = 0;
        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) == currentchar){
        //         nextcount++;
        //         continue;
        //     }
        //     if(nextcount % 2 == 0){
        //         nextcount = 1;

        //     }
        //     else{
        //         nextcount = 0;
        //         changerequired++;
        //     }
        //     currentchar = s.charAt(i);
        // }
        // return changerequired;

        int count = 0;
        int n = s.length();
        for(int i = 1; i < n; i+=2){
            int pc = s.charAt(i - 1);
            int c = s.charAt(i);
            if(pc != c){
                count++;
            }
        }
        return count;
    }
}