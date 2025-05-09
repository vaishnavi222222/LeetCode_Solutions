class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0 , p2 = 0;
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] == nums2[p2]){
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1] < nums2[p2]){
                p1++;
            }
            else p2++;
        }
        return list.stream().mapToInt(i -> i).toArray();
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums.length;j++){

        //     }
        // }
    }
}