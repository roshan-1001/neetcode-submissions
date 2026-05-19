class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        //for higher even places
        int res = 0;
        int count = 0;
        int sign = -1;

        for (int i=0; i<n-1;i++){
            if (arr[i]<arr[i+1]){
                if (sign == 1){
                    count+=1;
                    sign=0;
                }
                else{
                    count = 1;
                    sign=0;
                }
            }
            else if(arr[i]>arr[i+1]){
                if (sign == 0){
                    count+=1;
                    sign=1;
                }
                else{
                    count=1;
                    sign=1;
                }
            }
            else{
                count = 0;
                sign = -1;
            }
            res = Math.max(res,count);
        }
        return res+1;
    }
}