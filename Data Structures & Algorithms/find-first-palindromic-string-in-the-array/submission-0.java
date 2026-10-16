class Solution {
    public String firstPalindrome(String[] words) {

        for(String word : words){
            if(isPali(word)){
                return word;
            }
        }

        String s = "";
        return s;

    }

    private boolean isPali(String s){

        if (s==null){
            return true;
        }

        char[] c = s.toCharArray();

        int l = 0;
        int r = c.length-1;

        while(l<r){
            if(c[l]!=c[r]){
                return false;
            }
            l++;
            r--;
        }

        return true;


    }
}
