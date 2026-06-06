class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character,Integer> mp = new HashMap<>();

        for (int i = 0; i< keyboard.length(); i++){
            char c = keyboard.charAt(i);
            mp.put(c,i);
        }
        int res = 0;
        for (int j = 1; j<word.length(); j++){
            int curr = mp.get(word.charAt(j))-mp.get(word.charAt(j-1));
            res+= Math.abs(curr);
        }
        res+= mp.get(word.charAt(0));
        return res;
    }
}
