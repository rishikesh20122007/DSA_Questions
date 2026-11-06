class Solution {
    public int compress(char[] chars) {
        int readindex = 0;
        int writeindex = 0;

        while(readindex < chars.length){
            char currentchar = chars[readindex];
            int count = 0;

            //count dublicate characters 
            while(readindex < chars.length && currentchar == chars[readindex]){
                readindex++;
                count++;
            }

            // now we have curent character and its counts
            chars[writeindex] = currentchar;
            writeindex++;

            // now insert the count

            if(count > 1){
                String countstr = String.valueOf(count);
                for(char digit: countstr.toCharArray()){
                    chars[writeindex] = digit;
                    writeindex++;
                }
            }
        }

        //return the length of complete string
        return writeindex;
    }
}