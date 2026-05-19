class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n = nums.length;
        int[] prefix = new int[n+1]; 

        prefix[0] = 0;

        for (int m=0; m<n; m++){
            prefix[m+1] = prefix[m]+nums[m];
        }
        int count = 0;
        for(int i=0; i<n+1; i++){
            for(int j=i+1;j<n+1;j++){
                if (prefix[j]-prefix[i]==k){
                    count++;
                }
            }
        }

        return count;
    }
}