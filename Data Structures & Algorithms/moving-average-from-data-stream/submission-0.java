class MovingAverage {

    Queue<Integer> q;
    double sum = 0;
    int s;

    public MovingAverage(int size) {
        this.s = size;
        this.q = new LinkedList<>();
    }
    
    public double next(int val) {
        if (this.q.size()==s){
            this.sum -= this.q.remove();
        }
        this.sum += val;
        this.q.add(val);
        return this.sum/this.q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
