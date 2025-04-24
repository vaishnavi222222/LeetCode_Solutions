class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int k = (int) Arrays.stream(nums).distinct().count(), res = 0;
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> st = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                st.add(nums[j]);
                if (st.size() == k) res++;
            }
        }
        return res;
    }
}