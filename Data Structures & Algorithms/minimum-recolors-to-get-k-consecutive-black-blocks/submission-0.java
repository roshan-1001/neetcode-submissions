class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int curr = 0;
        int maxnoted = 0;
        for(int i= 0; i<k; i++){
            if(blocks.charAt(i) == 'B'){
                curr++;
            }
        }
        int l = 0;
        int r = k-1;
        maxnoted = Math.max(maxnoted,curr);
        while(r<n){
            if(blocks.charAt(l)=='B'){
                curr--;
            }
            l++;
            r++;
            if(r<n && blocks.charAt(r)=='B'){
                curr++;
            }
            maxnoted = Math.max(maxnoted,curr);
        }
        return k-maxnoted;
    }
}