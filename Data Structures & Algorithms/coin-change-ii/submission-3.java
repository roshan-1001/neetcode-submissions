class Solution {
    public int change(int amount, int[] coins) {
        Integer[][] memo = new Integer[coins.length][amount + 1];
        return count(coins, 0, amount, 0, memo);
    }

    public int count(int[] coins, int curri, int amount, int currsum, Integer[][] memo) {
        if (currsum == amount) {
            return 1;
        }
        if (currsum > amount || curri >= coins.length) {
            return 0;
        }

        if (memo[curri][currsum] != null) {
            return memo[curri][currsum];
        }

        memo[curri][currsum] = count(coins, curri + 1, amount, currsum, memo) + count(coins, curri, amount, currsum + coins[curri], memo);
        return memo[curri][currsum];
    }
}