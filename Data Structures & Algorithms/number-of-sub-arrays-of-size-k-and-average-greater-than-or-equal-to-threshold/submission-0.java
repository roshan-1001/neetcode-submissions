class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int avg = 0;
        int total = 0;
        int count=0;

        for (int R=0; R<arr.length; R++){
            if(R>=k){
                total -= arr[l];
                l++;
            }
            total+=arr[R];
            avg = total/k;

            if(R>=k-1 && avg>=threshold){
                count++;
            }
        }

        return count;
    }
}