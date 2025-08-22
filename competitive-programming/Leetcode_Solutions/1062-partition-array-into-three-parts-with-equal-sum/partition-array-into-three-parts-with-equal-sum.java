class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        if(sum%3 != 0) return false;
        int tar = sum / 3;
        int tsum = 0, cnt = 0;
        for(int i=0;i<arr.length;i++){
            tsum+= arr[i];
            if(tsum == tar){
                cnt++;
                tsum = 0;
            }
        }
        if(cnt >= 3) return true;
        return false;
    }
}