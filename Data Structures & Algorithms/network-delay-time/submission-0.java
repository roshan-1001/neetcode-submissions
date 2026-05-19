class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        HashMap<Integer,List<int[]>> edges = new HashMap<>();
        
        for (int[] time: times){
            edges.computeIfAbsent(time[0],key->new ArrayList<>()).add(new int[] {time[1], time[2]});
        }

        PriorityQueue<int[]> minheap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minheap.offer(new int[]{0,k});

        Set<Integer> visited = new HashSet<>();

        int time = 0;

        while(!minheap.isEmpty()){
            int [] curr = minheap.poll();
            int n1 = curr[1];
            int w1 = curr[0];
            if(visited.contains(n1)){
                continue;
            }
            visited.add(n1);
            time = w1;

            if(edges.containsKey(n1)){
                for(int[] next: edges.get(n1)){
                    int n2 = next[0];
                    int w2 = next[1];
                    if(!visited.contains(n2)){
                        minheap.offer(new int[]{w1 + w2, n2});
                    }
                }
            }
        }

        return visited.size() == n ? time:-1;

    }
}
