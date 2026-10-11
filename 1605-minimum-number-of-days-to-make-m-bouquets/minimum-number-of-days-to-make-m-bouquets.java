class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length; 
        if((long) m * k > n) return -1;
        
        int min = bloomDay[0];
        int max = bloomDay[0];

        for(int bloom : bloomDay){
            min = Math.min(min , bloom);
            max = Math.max(max , bloom);
        }
    //optimizing code by using  binary search algorithm
        while(min <= max){
            int mid  = min + (max - min) / 2;
            if(canmakebouquets(bloomDay, mid , m , k)){
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }
        return min;

    // //bruiteforce

    //         for(int i = min; i <= max; i++){
    //             if(canmakebouquets(bloomDay, i, m , k)){
    //                 return i;
    //             }
    //         }
    //         return -1;

    }

    private boolean canmakebouquets(int bloomDay[],int day, int m, int k){
        int counter = 0;
        int bouquets = 0;
        for(int bloom: bloomDay){
            if(bloom  <= day){
                counter++;
                if(counter == k){
                    bouquets++;
                    counter = 0;
                }
            }
            else{
                counter = 0;
            }
        }
        return bouquets >= m;
    }
}