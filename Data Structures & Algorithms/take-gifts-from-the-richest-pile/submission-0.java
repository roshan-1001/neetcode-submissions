

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int g: gifts){
            maxheap.add(g);
        }

        long res = 0;
        int curr;
        while(k>0){
            curr = maxheap.poll();
            curr = (int)(Math.sqrt(curr));
            maxheap.add(curr);
            k--;
        }

        while(!maxheap.isEmpty()){
            res+=maxheap.poll();
        }

        return res;



   
    
   
   
   
    }

    
}