class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length+1;
        int[] par = new int[n];
        int[] rank = new int[n];

        for(int i=0;i<n;i++){
            par[i] = i;
            rank[i] = 1;
        }

        for(int[] edge : edges){
            if(union(par,rank,edge[0],edge[1])){
                return new int[] {edge[0],edge[1]};
            }
        }
        return new int[0]; 
    }
    private boolean union(int[] par, int[] rank, int n1, int n2){
        int p1 = find(par,n1);
        int p2 = find(par,n2);
        if(p1==p2){
            return true;
        }
        if(rank[p1] > rank[p2]){
            par[p2] = p1;
            rank[p1] += rank[p2];
        }else{
            par[p1] = p2;
            rank[p2] += rank[p1];
        }
        return false;

    }
    private int find(int[] par, int n1){
        int p = par[n1];
        while(p!=par[p]){
            par[p] = par[par[p]];
            p = par[p];
        }
        return p;
    }
}

