class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        
        List<List<Integer>> res = new ArrayList<>();

        if (nums.length == 0) {
            res.add(Arrays.asList(lower, upper));
            return res;
        }

        if (nums[0] - lower >= 1) {
            res.add(Arrays.asList(lower, nums[0] - 1));
        }

        int curr = 1;

        while (curr < nums.length) {

            if (nums[curr] - nums[curr - 1] > 1) {
                res.add(Arrays.asList(
                    nums[curr - 1] + 1,
                    nums[curr] - 1
                ));
            }

            curr++;
        }

        if (upper - nums[nums.length - 1] >= 1) {
            res.add(Arrays.asList(
                nums[nums.length - 1] + 1,
                upper
            ));
        }

        return res;
    }
}
