class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> mp = new LinkedHashMap<>();
        for (char c: s.toCharArray()){
            if (mp.containsKey(c)){
                mp.put(c,mp.get(c)+1);
            }
            else{
                mp.put(c,1);
            }
        }
        char res = ' ';
        for(Map.Entry<Character,Integer> entry: mp.entrySet()){
            if (entry.getValue() == 1){
                res = entry.getKey();
                break;
            }
        }
        for(int i=0; i<s.length();i++){
            if (s.charAt(i)==res){
                return i;
            }
        }
        return -1;
    }
}