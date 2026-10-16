class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int l = 0;
        int r = nums.length - 1;

        while(l<r){
            if(isEven(nums[l])){
                l++;
            }
            else if(isEven(nums[r])){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
                l++;
            }
            else{
                r--;
            }

        }

        return nums;

    }

    private boolean isEven(int n){
        if (n%2 == 0){
            return true;
        }
        return false;
    }
}