class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int n = nums.length;
        int t = n-k+1;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b,a));

        for(int num : nums){
            maxHeap.offer(num);
            if (maxHeap.size()>t){
                maxHeap.poll();
            }
        }
        return maxHeap.poll();
    }
}
