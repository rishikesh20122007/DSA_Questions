class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0) +1);
        }
        for(int key:freq.keySet()){
            int currfreq = freq.get(key);
            if(currfreq > 1) return true;
        }
        return false;
    }
}