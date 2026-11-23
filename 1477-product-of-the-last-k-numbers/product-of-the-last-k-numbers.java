class ProductOfNumbers {
    //storing product of the stream
    private ArrayList<Integer> prefproduct = new ArrayList<>();
    private int size = 0;


    public ProductOfNumbers() {
        //Initailze the product list by 1 
        //handle multiplication approach
        this.prefproduct.add(1);
        this.size = 0;
    }
    
    public void add(int num) {
        if(num == 0){
            //if num is 0 , reset product -> 0 * n = 0
            this.prefproduct = new ArrayList<Integer>();
            this.prefproduct.add(1);
            this.size = 0;
        }
        else{
            //store the product of current number with last product
            this.prefproduct.add(this.prefproduct.get(size) * num);
            this.size++;
        }
    }
    
    public int getProduct(int k) {

        //check product length exceeds the size of valid product
        //base case
        if(k > this.size) return 0;

        //calcutate product of last k element  usign division

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