class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
       int n = customers.length;
       int[] grumpyloss = new int[n];

       for(int i=0;i<n;i++){
        grumpyloss[i] = grumpy[i]*customers[i];
       } 

       int l = 0;
       int r = minutes-1;

       int currloss = 0;
       int maxloss = 0;
       for(int i=0;i<=r;i++){
        currloss += grumpyloss[i];
       }

       maxloss = currloss;
       while(r<n){
        currloss -= grumpyloss[l];
        l++;
        r++;
        if(r<n){
            currloss += grumpyloss[r];
        }
        maxloss = Math.max(maxloss,currloss);
       }
       int totalhappy=0;
       int totalloss=0;
       for(int i =0;i<n;i++){
        totalhappy += customers[i];
        if(grumpy[i]==0){
            continue;
        }
        else{
            totalloss += customers[i];
        }
       }
       return totalhappy-totalloss+maxloss;
    }
}