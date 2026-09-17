class StockSpanner {

    private final Stack<int[]> st;


    public StockSpanner() {
        this.st = new Stack<>();
    }
    
    public int next(int price) {
        
        int[] curr = new int[2];
        curr[0] = price;
        int span = 1;

        while(!st.isEmpty() && st.peek()[0]<=price){
            span+= st.pop()[1];
        }
        curr[1] = span;
        st.add(curr);
        return span;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */