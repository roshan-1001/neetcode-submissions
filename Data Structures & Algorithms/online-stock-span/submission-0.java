class StockSpanner {

    private final List<Integer> prices;
    private int days;


    public StockSpanner() {
        this.prices = new ArrayList<>();
        this.days = 0;
    }
    
    public int next(int price) {
        this.prices.add(price);
        this.days++;
        int curr = this.days-1;
        int res = 0;
        while(curr>=0){
            if(prices.get(curr)<=price){
                res++;
            }
            else{
                return res;
            }
            curr--;
        }
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */