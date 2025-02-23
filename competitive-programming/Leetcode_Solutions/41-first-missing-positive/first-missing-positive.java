class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] a = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0 && nums[i] <= nums.length){
            a[nums[i]] = true;
            }
        }
        //int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i] == false){
                return i;
            }
        }
        return nums.length+1;
    }
}