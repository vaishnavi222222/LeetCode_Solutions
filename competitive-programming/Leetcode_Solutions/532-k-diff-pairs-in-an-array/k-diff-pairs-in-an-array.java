class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<String> hs = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k && i != j) {
                    int a = Math.min(nums[i], nums[j]);
                    int b = Math.max(nums[i], nums[j]);
                    String pair = a + "," + b;
                    if (!hs.contains(pair)) {
                        hs.add(pair);
                        cnt++;
                    }
                }
            }
        }
        return hs.size();
    }
}
