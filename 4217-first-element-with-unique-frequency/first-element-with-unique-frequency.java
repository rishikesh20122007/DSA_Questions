class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        HashMap<Integer,Integer> freqcount = new HashMap<>();
        for(int f : freq.values()){
            freqcount.put(f,freqcount.getOrDefault(f,0)+1);
        }
        for(int num : nums){
            int f = freq.get(num);

            if(freqcount.get(f) == 1)
            return num;
        }
        
        //nothing to return then return -1 as per question
        return -1;
    }
}