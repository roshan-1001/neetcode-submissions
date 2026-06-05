class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        int curr = 2;
        int element;

        List<Integer> initial = new ArrayList<>(List.of(1));

        res.add(initial);

        while(curr <= numRows){
            List<Integer> currlist = new ArrayList<Integer>();
            currlist.add(1);
            for(int i=1; i<curr-1; i++){
                element = res.get(curr-2).get(i) + res.get(curr-2).get(i-1);
                currlist.add(element);
            }
            currlist.add(1);
            res.add(currlist);
            curr++;
        }

        return res;
    }
}