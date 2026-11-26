class Solution {
    public boolean canAliceWin(int n) {
        //Initailize the stone removal in first attempt
        //Initaialize the count from 0
        int stoneremove = 10;
        int count = 0;

        //processing
        while(n >= stoneremove){
            n = n - stoneremove;
            stoneremove--;
            count++;
        }

        //return either true or false
        return count % 2 == 1;

    }
}