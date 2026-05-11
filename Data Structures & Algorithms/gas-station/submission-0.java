class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i];
        }
        int totalcost = 0;
        for(int i=0;i<cost.length;i++){
            totalcost+=cost[i];
        }
        if (totalcost>sum){
            return -1; 
        }
        int currsum = 0;
        int currcost = 0;
        int res = 0;
        
        for(int i=0; i<cost.length;i++){
            currsum += gas[i];
            currcost += cost[i];
            if (currcost>currsum){
                res = i+1;
                currsum = 0;
                currcost = 0;
            }
        }
        return res;
    }
}
