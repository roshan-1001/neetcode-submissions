class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        
        Set<Integer> visited = new HashSet<>();

        Map<Integer,List<double[]>> adj = new HashMap<>();

        int m = edges.length;

        for (int i=0; i<m; i++){
            if(!adj.containsKey(edges[i][0])){
                adj.put(edges[i][0],new ArrayList<>()) ;
            }
            adj.get(edges[i][0]).add(new double[] {edges[i][1], succProb[i]});
            if(!adj.containsKey(edges[i][1])){
                adj.put(edges[i][1],new ArrayList<>()) ;
            }
            adj.get(edges[i][1]).add(new double[] {edges[i][0], succProb[i]});
        }

        PriorityQueue<double[]> maxheap = new PriorityQueue<>((a,b) -> Double.compare(b[0],a[0]));

        maxheap.offer(new double[]{1.0,start_node});

        while(!maxheap.isEmpty()){
            double[] curr = maxheap.poll();
            double prob = curr[0];
            int node = (int) curr[1];

            if(node==end_node){
                return prob;
            }
            if(visited.contains(node)){
                continue;
            }
            visited.add(node);
            if (!adj.containsKey(node)) continue;
            for(double[] edge : adj.get(node)){
                double prob1 = prob*edge[1];
                int nodenext = (int) edge[0];
                if(!visited.contains(nodenext)){
                    maxheap.offer(new double[]{prob1,nodenext});
                }
            }

        }
        return 0.0;
    }
}