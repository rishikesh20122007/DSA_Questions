class Solution {
    public boolean canAliceWin(int n) {
       int stoneremove = 10;
        int a = 0;

        while(n >= stoneremove){
            n = n - stoneremove;
            stoneremove--;
            a++;
        }

        return a % 2 == 1;

    }
}