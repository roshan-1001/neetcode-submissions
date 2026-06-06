class Logger {

    HashMap<String,Integer> mp;

    public Logger() {
        this.mp = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (this.mp.containsKey(message)){
            if (timestamp - 10 < this.mp.get(message)){
                
                return false;
            }
        }
        this.mp.put(message,timestamp);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
