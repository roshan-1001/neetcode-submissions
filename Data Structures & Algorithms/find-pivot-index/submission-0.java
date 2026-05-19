class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] arrleft = new int[n];
        int[] arrright = new int[n];
        
        arrleft[0] = nums[0];
        for (int i=1; i<n; i++){
            arrleft[i] = arrleft[i-1] + nums[i];
        } 

        arrright[n-1] = nums[n-1];
        for (int i=n-2; i>=0; i--){
            arrright[i] = arrright[i+1] + nums[i];
        } 

        for(int j = 0; j<n;j++){
            if (arrleft[j] == arrright[j]){
                return j;
            }
        }

        return -1;
    }
}