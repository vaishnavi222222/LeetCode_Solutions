class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] > 0) l1.add(nums[i]);
            else l2.add(nums[i]);
        }
        int j=0,k=0;
        for(int i=0;i<n;i+=2){
            nums[i] = l1.get(j);
            nums[i+1] = l2.get(k);
            j++;
            k++;
        }
        return nums;
    }
}