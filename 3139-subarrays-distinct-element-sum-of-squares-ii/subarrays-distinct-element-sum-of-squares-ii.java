class Solution {
    public int sumCounts(int[] nums) {
        int n = nums.length;
        long ans = 0;
        int current = 0;

        Bit bitwise = new Bit(n + 10);
        Map<Integer,Integer> fetch = new HashMap<>();
        long modulo = 1000000007;
        for(int i = 0; i < n; i++){
            int a = nums[i];
            int b = fetch.getOrDefault(a , -1) + 1;
            long q = bitwise.query(b , i);
            current = (int)((current + q * 2 + i - b + 1) % modulo);
            ans = (ans + current) % modulo;
            bitwise.add(b , i , 1);
            fetch.put(a , i);

        }
        return (int) ans;
    }
}

class Bit{
    long tree1[];
    long tree2[];
    int size;

    public Bit(int n){
        this.size = n;
        this.tree1 = new long[n + 2];
        this.tree2 = new long[n + 2];

    }

    private int lowbit(int i){
        return i &  -i;
    }

    public void add(int left, int right , int delta){
        add(left, delta);
        add(right + 1 , -delta);
    }

    public long query(int left , int right){
        return query(right) - query (left - 1);
    }

    private void add(int i , int delta){
        i += 1;
        long rawindex = i;
        while( i  <= size ){
           tree1[i] = tree1[i] + delta;
           tree2[i] += rawindex * delta;
           i += lowbit(i);
        }
    }

    private long query(int i){
        i += 1;
        long rawindex = i + 1;
        if(i > size){
                i = size;
            }
            long ans = 0;
            while(i > 0){
                ans += rawindex * tree1[i] - tree2[i];
                i = i - lowbit(i);
            }
        return ans;
    }
}