class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int n:nums1){
            s.add(n);
        }
        for (int i: nums2){
            if (s.contains(i)){
                res.add(i);
                s.remove(i);
            }
        }
        int[] arr = res.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return arr;
    }
}