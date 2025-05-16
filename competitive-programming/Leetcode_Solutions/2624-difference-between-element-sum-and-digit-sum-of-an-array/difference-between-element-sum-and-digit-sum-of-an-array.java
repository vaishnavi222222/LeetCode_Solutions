class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        for(int i=0;i<nums.length;i++){
            sum1 += nums[i];
        }
        int sum2 = 0;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            while( val!= 0){
                int v = val % 10;
                sum2 += v;
                val /= 10;
            }
        }
        return Math.abs(sum1-sum2);
    }
}