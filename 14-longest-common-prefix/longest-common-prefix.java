class Solution {
    public String longestCommonPrefix(String[] strs) {
        // int n = strs.length;

        String prefix = strs[0];
        // int m = prefix.length();

        for(int i = 1  ; i < strs.length; i++){

            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()) {
                return "";
                }
            }
        }
        return prefix;
    }
}