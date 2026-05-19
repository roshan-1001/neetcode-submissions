class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int currmax = arr[n-1];
        int j=n-2;
        int temp=0;
        while(j>=0){

            if(arr[j]> currmax){
                temp = arr[j];
                arr[j] = currmax;
                currmax = temp;
            }
            else{
                arr[j] = currmax;
            }
            
            j--;
        }
        arr[n-1] = -1;
        return arr;
    }

}