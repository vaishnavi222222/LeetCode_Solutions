class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        boolean[] a = new boolean[n+1];
        for(int i = 0;i<n;i++){
            a[nums[i]] = true;
        }
        for(int i=1;i<n+1;i++){
            if(a[i] == false) result.add(i);
        }
        return result;
    }
}