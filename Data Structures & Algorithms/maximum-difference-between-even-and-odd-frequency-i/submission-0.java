class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[27];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int oddmax = 0;
        int evenmin = s.length();

        for(int i=0; i<27;i++){
            if(isOdd(arr[i])){
                if(arr[i]>oddmax){
                    oddmax = arr[i];
                }
            }
            else{
                if(arr[i]<evenmin && arr[i]!=0){
                    evenmin = arr[i];
                }
            }
        }
        return oddmax-evenmin;
    }
    public boolean isOdd(int n){
        if(n%2==1){
            return true;
        }
        return false;
    }
}