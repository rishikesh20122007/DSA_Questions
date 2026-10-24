class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int dom[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int prefixsum[] = new int[13];
        for(int i = 0; i < 12; i++){
            prefixsum[i + 1] = prefixsum[i] + dom[i];
        }

        int arrivealliceday = calculatedom(arriveAlice, prefixsum);
        int leavealiceday = calculatedom(leaveAlice, prefixsum);
        int arrivebobday = calculatedom(arriveBob, prefixsum);
        int leavebobday = calculatedom(leaveBob, prefixsum );
        return Math.max(0, Math.min(leavealiceday,leavebobday) - Math.max(arrivealliceday, arrivebobday) + 1);
    }

    private int calculatedom(String day , int prefixsum[]){
        int month = Integer.parseInt(day.substring(0 , 2));
        int date = Integer.parseInt(day.substring(3));
        return prefixsum[month - 1] + date;
    }
}