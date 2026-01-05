class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int p1 = 0;
        for(int p2 = 1;p2<n;p2++){
            if(nums[p1] != nums[p2]){
                p1++;
                nums[p1] = nums[p2];
            }
        }
        return p1+1;
    }
}