class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        unordered_map<int,int>indices;
        for (int i=0; i<n; i++){
            int diff = target - nums[i];
            if(indices.find(diff) != indices.end()){
                return {indices[diff],i};
            }
            indices.insert({nums[i],i});
        }
        return{};

    }
};
