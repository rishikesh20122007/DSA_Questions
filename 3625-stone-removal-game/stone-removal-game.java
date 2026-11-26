class Solution {
    public boolean canAliceWin(int n) {
       int stoneremove = 10;
        int count = 0;

        while(n >= stoneremove){
            n = n - stoneremove;
            stoneremove--;
            count++;
        }

        return count % 2 == 1;

    }
}