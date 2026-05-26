class Solution {
    public int maxScore(String s) {
       int n = s.length(); 
       int[] leftzeroes= new int[n+1];
       int[] rightones = new int[n+1];

        for (int i = 1;i<n+1;i++){
            if(s.charAt(i-1)=='0'){
                leftzeroes[i] = leftzeroes[i-1] + 1;
            }
            else{
                leftzeroes[i] = leftzeroes[i-1];
            }
        }
        for (int j=n-1;j>=0;j--){
            if(s.charAt(j)=='1'){
                rightones[j] = rightones[j+1] +1;
            }
            else{
                rightones[j] = rightones[j+1];
            }
        }
        int res = 0;
        for (int i=1; i<n;i++){
            res = Math.max(res,leftzeroes[i]+rightones[i]);
        }
        return res;
    }
}