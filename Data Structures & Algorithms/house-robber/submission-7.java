class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }

        arr[0] = nums[0];
        arr[1] = nums[1];
        arr[2] = Math.max(nums[2]+nums[0],nums[1]);

        for (int i=3;i<n;i++){
            arr[i] = Math.max(Math.max(arr[i-3]+nums[i],arr[i-2]+nums[i]), arr[i-1]);
        }
        return (arr[n-1]);
    }
}
