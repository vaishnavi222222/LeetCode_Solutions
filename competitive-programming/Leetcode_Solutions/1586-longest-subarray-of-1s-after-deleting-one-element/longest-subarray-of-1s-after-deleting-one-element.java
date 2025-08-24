class Solution {
    public int longestSubarray(int[] nums) {
        int o = 0,z=0,r =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) z++;
            while(z > 1){
                if(nums[o] == 0) z--;
                o++;
            }
            r = Math.max(r,i-o);
        }
        return r;
    }
}