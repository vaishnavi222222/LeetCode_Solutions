class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            map.put(nums[i],1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>(nums.length/2)) 
            ans = nums[i];
        }
        return ans;   }
}