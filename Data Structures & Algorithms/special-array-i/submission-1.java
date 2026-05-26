class Solution {
    public boolean isArraySpecial(int[] nums) {
        int length = nums.length;
        if (length <=1){
            return true;
        }
        int parity = Math.abs(nums[1]-nums[0]) % 2;
        if (parity == 0) {
            return false;
        }
        for (int i=1;i<length;i++){
            if(Math.abs(nums[i]-nums[i-1]) % 2 != parity){
                return false;
            }
        }
        return true;
    }
}