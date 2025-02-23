class Solution {
    public int searchInsert(int[] nums, int t) {
        int n=nums.length;
        int lo=0,hi=n-1,ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==t) return mid;
            else if(nums[mid]<t){
                  lo=mid+1;
                  ans=mid+1;
            }
            else if(nums[mid]>t){
                hi=mid-1;
                ans=mid-1;
            }
    }
    return lo;
}
}