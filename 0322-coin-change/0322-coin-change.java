class Solution {
    public int coinChange(int[] coins, int amount) {
        // 금액 + 1만큼의 배열을 생성 (0부터 amount까지)
        int max = amount + 1;
        int[] dp = new int[max];
        
        // 초기값을 아주 큰 값(금액 + 1)으로 채움
        Arrays.fill(dp, max);
        dp[0] = 0; // 0원을 만드는 데 필요한 동전은 0개

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // 최종 값이 초기값보다 크면 조합이 불가능하다는 뜻
        return dp[amount] > amount ? -1 : dp[amount];
    }
}