class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copy);
        int ans  = 0;
        for(int i = 0;i<copy.length;i++){
            if(heights[i] != copy[i]){
                ans++;
            }
        }
        return ans;
    }
}