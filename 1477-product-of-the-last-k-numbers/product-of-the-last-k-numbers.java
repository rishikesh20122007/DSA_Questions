class ProductOfNumbers {
    private ArrayList<Integer> prefproduct = new ArrayList<>();
    private int size = 0;

    
    public ProductOfNumbers() {
        this.prefproduct.add(1);
        this.size = 0;
    }
    
    public void add(int num) {
        if(num == 0){
            this.prefproduct = new ArrayList<Integer>();
            this.prefproduct.add(1);
            this.size = 0;
        }
        else{
            this.prefproduct.add(this.prefproduct.get(size) * num);
            this.size++;
        }
    }
    
    public int getProduct(int k) {
        if(k > this.size) return 0;

        return (this.prefproduct.get(this.size) /
                this.prefproduct.get(this.size - k));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */