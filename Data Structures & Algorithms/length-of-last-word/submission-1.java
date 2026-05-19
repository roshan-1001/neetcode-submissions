class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        if(s.charAt(l-1)==' '){
            int r = l-1;
            while(s.charAt(r)==' '){
                r--;
            }
            int ll = r-1;
            while(s.charAt(ll)!=' '){
                ll--;
            }
            return r-ll;
        }
        else{
            int ll = l-1;
            while(ll>=0 && s.charAt(ll)!=' '){
                ll--;
            }
            return l-ll-1;
        }
    }
}