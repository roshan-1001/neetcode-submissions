class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        int i = 0;
        int left = toBeRemoved[0];
        int right = toBeRemoved[1];

        List<List<Integer>> res = new ArrayList<>();

        for (int[] interval: intervals){
            if (right <= interval[0]){
                res.add(Arrays.asList(interval[0],interval[1]));
            }
            else if (left >= interval[1]){
                res.add(Arrays.asList(interval[0], interval[1]));
            }
            else{
                if (interval[0] < left) {
                    res.add(Arrays.asList(interval[0], left));
                }
                // right piece remains
                if (interval[1] > right) {
                    res.add(Arrays.asList(right, interval[1]));
                }
            }

        }
        return res;
    }
}
