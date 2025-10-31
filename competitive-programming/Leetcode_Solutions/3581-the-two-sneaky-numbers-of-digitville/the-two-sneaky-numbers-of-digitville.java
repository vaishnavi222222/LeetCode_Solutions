class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int a = -1,b = -1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                if(a == -1) a = nums[i];
                else if ( a != nums[i]) b = nums[i];
            }
            set.add(nums[i]);
        }
        int []ar = {a,b};
        return ar;
    }
}