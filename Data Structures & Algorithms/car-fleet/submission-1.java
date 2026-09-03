class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int n = position.length;

        int[][] pair = new int[n][2];

        for(int i = 0; i<n; i++){
            pair[i] = new int[] {position[i], speed[i]};
        }

        Arrays.sort(pair, (a,b) -> a[0]-b[0]);

        Stack<Double> stack = new Stack<>();

        stack.push((double)(target-pair[n-1][0])/(double)(pair[n-1][1]));
        
        for(int i = n-2; i>=0; i--){
            Double curr = stack.peek();
            if((double)(target-pair[i][0])/(double)pair[i][1]>curr){
                stack.push((double)(target-pair[i][0])/(double)pair[i][1]);
            }
        }
        return stack.size();

    }
}
