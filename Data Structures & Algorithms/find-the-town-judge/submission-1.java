class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inc = new int[n+1];
        int[] out = new int[n+1];

        for (int[] t: trust){
            inc[t[1]]++;
            out[t[0]]++;
        }

        for(int i=1; i<n+1; i++){
            if (inc[i]-out[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}