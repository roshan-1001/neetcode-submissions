class Solution {
    public void swap(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
    public void moveZeroes(int[] nums) {
        
        int n = nums.length-1;
        int i = 0;
        int r = 0;
        while(r<=n){
            if (nums[r]!=0){
                swap(nums,r,i);
                i++;
            }
            
            r++;
        }
        return;
    }

}