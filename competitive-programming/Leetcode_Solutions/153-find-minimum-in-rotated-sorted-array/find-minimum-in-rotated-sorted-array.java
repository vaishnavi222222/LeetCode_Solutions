class Solution {
    public int findMin(int[] nums) {
        int p1 = 0;
        int p2  = nums.length - 1;
        while(p1 < p2){
            if(nums[p1] > nums[p2]) p1++;
            else p2 --;
        }
        return nums[p1];
    }
}