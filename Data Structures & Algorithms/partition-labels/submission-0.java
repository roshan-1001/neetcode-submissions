class Solution {
    public List<Integer> partitionLabels(String s) {
        
        Map<Character,Integer> lastIndex = new HashMap<>();
        char[] arr = s.toCharArray();
        int l = arr.length;

        for (int i=0; i<l; i++){
            lastIndex.put(arr[i],i);
        }

        List<Integer> res = new ArrayList<>();
        int size = 0;
        int currend = 0;

        for(int i=0; i<l; i++){
            int end = lastIndex.get(arr[i]);
            currend = Math.max(end,currend);
            size++;

            if(i==currend){
                res.add(size);
                size = 0;
            }

        }

        return res;



        


    }
}


