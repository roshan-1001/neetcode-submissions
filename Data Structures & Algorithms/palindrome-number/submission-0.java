class Solution {
    public boolean isPalindrome(int x) {
        int num=0;
        int og = x;

        while(x>0){
            int digit = x%10;
            x = x/10;
            num = num*10 + digit;
        }
        if (num==og){
            return true;
        }
        else{
            return false;
        }
    }
}