class Solution {
    public int helper(int[] a){
        int N = a.length;
        if(N == 1) return a[0];
        int[]dp = new int[N+1];
        dp[0] = 0;
        dp[1] = a[0];
        for(int i=2;i<N+1;i++){
            int steel = dp[i-2] + a[i-1];
            int skip = dp[i-1];
            dp[i] = Math.max(steel,skip);
        }
        return dp[N];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] skipf = new int[n-1];
        int []skipl = new int[n-1];
        for(int i=0;i<n-1;i++){
            skipf[i] = nums[i+1];
            skipl[i] = nums[i];
        }
        int r1 = helper(skipf);
        int r2 = helper(skipl);
        return Math.max(r1,r2);
    }
}