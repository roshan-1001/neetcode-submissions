class Solution {
    public int scoreOfString(String s) {
        int l = s.length();
        int res = 0;
        for (int i = 1; i<l; i++){
            int cprev = s.charAt(i-1);
            int c = s.charAt(i);

            res += Math.abs(cprev-c);
        }
        return res;
    }
}