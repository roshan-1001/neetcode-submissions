class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> s = new HashSet<>();

        int L = 0;

        for (int R=0;R<nums.length;R++){
            if(R-L>k){
                s.remove(nums[L]);
                L++;
            }
            if(s.contains(nums[R])){
                return true;
            }

            s.add(nums[R]);

        }
        return false;
    }
}