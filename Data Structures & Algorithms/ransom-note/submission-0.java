class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mp = new HashMap<>();

        for(char c: magazine.toCharArray()){
            if(!mp.containsKey(c)){
                mp.put(c,1);
            }
            else{
                mp.put(c,mp.get(c)+1);
            }
        }

        for(char c: ransomNote.toCharArray()){
            if (!mp.containsKey(c) || mp.get(c)==0){
                return false;
            }
            else{
                mp.put(c,mp.get(c)-1);
            }
        }
        return true;
    }
}